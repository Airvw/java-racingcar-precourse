package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.ValidationUtils.makeSplitedArray;


public class InputView {

    ValidationUtils validationUtils = new ValidationUtils();

    public String[] inputCarNames(){
        System.out.println(MessageUtils.INPUT_CAR.getMessage());
        try {
            return validationUtils.validateCarNames(makeSplitedArray(readLine()));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCarNames();
        }
    }

    public int inputTryCnt(){
        System.out.println(MessageUtils.INPUT_TRY.getMessage());
        try {
            return validationUtils.isValidCnt(readLine());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputTryCnt();
        }
    }
}
