package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static racingcar.ValidationUtils.ERROR_MESSAGE;
import static racingcar.ValidationUtils.makeSplit;

public class ValidationUtilsTest {

    private ValidationUtils validationUtils;
    private String inputCarNames;
    private String inputTryCnt;

    @BeforeEach
    void setUp(){
        validationUtils = new ValidationUtils();
    }

    @Test
    @DisplayName("자동차 이름 입력값 검증 성공 테스트")
    void inputCarNamesTest(){
        inputCarNames = "pobi,woni,java";
        String[] carNames = makeSplit(inputCarNames);
        assertThat(carNames.length).isEqualTo(3);
        assertThat(validationUtils.validCarNames(carNames)).isTrue();
    }

    @Test
    @DisplayName("자동차 이름 입력값 검증 실패 테스트")
    void inputCarNamesErrorTest(){
        inputCarNames = "pobi,woni,javajigi";
        assertThatThrownBy(() -> validationUtils.validCarNames(makeSplit(inputCarNames))).isInstanceOf(IllegalArgumentException.class)
                        .hasMessageContaining(ERROR_MESSAGE);
    }

    @Test
    @DisplayName("횟수 입력값 검증 성공 테스트")
    void inputTryCntTest(){
        inputTryCnt = "5";
        assertThat(validationUtils.isValidCnt(inputTryCnt)).isEqualTo(Integer.parseInt(inputTryCnt));
    }

    @Test
    @DisplayName("횟수 입력값 검증 실패 테스트")
    void inputTryCntErrorTest(){
        inputTryCnt = "5555|$$5";
        assertThatThrownBy(() -> validationUtils.isValidCnt(inputTryCnt)).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}
