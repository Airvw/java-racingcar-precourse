package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomAction {

    private final int BOUNDARY_NUM = 4;

    private RacingCarAction racingCarAction;
    private ValidationUtils validationUtils = new ValidationUtils();

    public RandomAction(){
        this.racingCarAction = getRandomCarAction(generateRandomNum());
    }

    public int generateRandomNum() {
        int randomNum = pickNumberInRange(validationUtils.MIN_NUMBER, validationUtils.MAX_NUMBER);
        if(validationUtils.isValidNum(randomNum)){
            return randomNum;
        }
        return generateRandomNum();
    }

    public RacingCarAction getRandomCarAction(int randomNum) {
        if(randomNum < BOUNDARY_NUM) return RacingCarAction.STOP;
        return RacingCarAction.GO;
    }

    public RacingCarAction getRacingCarAction() {
        return racingCarAction;
    }
}
