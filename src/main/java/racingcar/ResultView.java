package racingcar;

import java.util.List;

public class ResultView {
    public void printCarPosition(RacingCar racingCar){
        System.out.println(racingCar.getRacingCarName() + " : " + printDash(racingCar.getRacingCarPosition()));
    }

    private String printDash(int carPosition){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < carPosition; i++) sb.append("-");
        return sb.toString();
    }

    public void printWinner(List<RacingCar> racingCarList) {
        int n = racingCarList.size();
        System.out.print("최종 우승자 : ");
        for(int i = 0; i < n; i++){
            System.out.print(racingCarList.get(i).getRacingCarName());
            isLastWinner(i, n);
        }
    }

    private void isLastWinner(int carIdx, int listSize) {
        if(carIdx != listSize - 1) System.out.print(", ");
    }
}
