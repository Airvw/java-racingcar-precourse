package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCars {
    private List<RacingCar> racingCarList;
    private int maxPosition = 0;
    public RacingCars(String[] carNamesArray) {
        racingCarList = makeRacingCarList(carNamesArray);
    }

    private List<RacingCar> makeRacingCarList(String[] carNamesArray) {
        List<RacingCar> result = new ArrayList<>();
        for(String carName : carNamesArray) result.add(new RacingCar(carName, 0));
        return result;
    }

    public void race(){
        for(RacingCar racingCar : racingCarList){
            racingCar.checkCarAction(new RandomAction().getRacingCarAction());
            getMaxCarPosition(racingCar.getRacingCarPosition());
        }
    }

    private void getMaxCarPosition(int racingCarPosition) {
        maxPosition = Math.max(maxPosition, racingCarPosition);
    }

    public List<RacingCar> getWinnerCar(){
        return racingCarList.stream()
                .filter(racingCar -> racingCar.getRacingCarPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    public List<RacingCar> getRacingCarList() {
        return racingCarList;
    }
}
