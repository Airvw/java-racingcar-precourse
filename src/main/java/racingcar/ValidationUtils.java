package racingcar;

public class ValidationUtils {

    public static final String CAR_REGEX = ",";
    private static final String CNT_REGEX = "[0-9]+";
    public static final String ERROR_MESSAGE = "[ERROR]";

    private static final int LIMIT_LENGTH = 5;

    public boolean validCarNames(String[] carNames) {
        for(String carName : carNames){
            isValidCarName(carName);
        }
        return true;
    }

    private void isValidCarName(String carName) {
        if(carName.length() > LIMIT_LENGTH) throw new IllegalArgumentException(ERROR_MESSAGE + LIMIT_LENGTH + "글자를 초과하여 입력하였습니다.");
    }

    public int isValidCnt(String inputTryCnt) {
        if(!inputTryCnt.matches(CNT_REGEX)) throw new IllegalArgumentException(ERROR_MESSAGE + "숫자 이외의 값을 입력하였습니다.");
        return Integer.parseInt(inputTryCnt);
    }

    public static String[] makeSplit(String inputCarNames) {
        return inputCarNames.split(CAR_REGEX);
    }
}
