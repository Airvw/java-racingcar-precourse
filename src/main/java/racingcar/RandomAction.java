package racingcar;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class RandomAction {

    private final int BOUNDARY_NUM = 4;

    private int randomNum;
    private ValidationUtils validationUtils = new ValidationUtils();

    public RandomAction(){
        randomNum = generateRandomNum();
    }

    private int generateRandomNum() {
        int result = pickNumberInRange(validationUtils.MIN_NUMBER, validationUtils.MAX_NUMBER);
        if(validationUtils.isValidNum(result)){
            return result;
        }
        return generateRandomNum();
    }

    public RacingCarAction getCarAction(int randomNum) {
        if(randomNum < BOUNDARY_NUM) return RacingCarAction.STOP;
        return RacingCarAction.GO;
    }

    public int getRandomNum() {
        return randomNum;
    }
}
