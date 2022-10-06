package racingcar;

public class ValidationUtils {

    private static final String CAR_REGEX = ",";
    private static final String CNT_REGEX = "[0-9]+";
    public static final String ERROR_MESSAGE = "[ERROR] ";

    public final int MIN_NUMBER = 0;
    public final int MAX_NUMBER = 9;

    private static final int LIMIT_LENGTH = 5;

    public String[] validateCarNames(String[] carNames) throws IllegalArgumentException {
        for(String carName : carNames){
            isValidCarName(carName);
        }
        return carNames;
    }

    private void isValidCarName(String carName) throws IllegalArgumentException {
        if(carName.length() > LIMIT_LENGTH) throw new IllegalArgumentException(ERROR_MESSAGE + LIMIT_LENGTH + "글자를 초과하여 입력하였습니다.");
    }

    public int isValidCnt(String inputTryCnt) throws IllegalArgumentException {
        if(!inputTryCnt.matches(CNT_REGEX)) throw new IllegalArgumentException(ERROR_MESSAGE + "숫자 이외의 값을 입력하였습니다.");
        return Integer.parseInt(inputTryCnt);
    }

    public static String[] makeSplitedArray(String inputCarNames) {
        return inputCarNames.split(CAR_REGEX);
    }

    public boolean isValidNum(int result) {
        return result >= MIN_NUMBER && result <= MAX_NUMBER;
    }
}
