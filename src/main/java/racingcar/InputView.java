package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.ValidationUtils.makeSplitedArray;


public class InputView {

    ValidationUtils validationUtils = new ValidationUtils();

    public String[] inputCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        try {
            return validationUtils.validateCarNames(makeSplitedArray(readLine()));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCarNames();
        }
    }

    public int inputTryCnt(){
        System.out.println("시도할 횟수는 몇회인가요?");
        try {
            return validationUtils.isValidCnt(readLine());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputTryCnt();
        }
    }
}
