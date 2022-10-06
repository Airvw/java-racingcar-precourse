package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    private List<RacingCar> racingCarList;
    public RacingCars(String[] carNamesArray) {
        racingCarList = makeRacingCarList(carNamesArray);
    }

    private List<RacingCar> makeRacingCarList(String[] carNamesArray) {
        List<RacingCar> result = new ArrayList<>();
        for(String carName : carNamesArray) result.add(new RacingCar(carName, 0));
        return result;
    }

    public List<RacingCar> getRacingCarList() {
        return racingCarList;
    }
}
