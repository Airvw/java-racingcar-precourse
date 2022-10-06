package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomActionTest {

    RandomAction randomAction;
    ValidationUtils validationUtils;

    @BeforeEach
    void setUp(){
        randomAction = new RandomAction();
        validationUtils = new ValidationUtils();
    }

    @Test
    @DisplayName("랜덤 숫자 0~9 사이의 값 테스트")
    void makeRandomNumTest(){
        assertThat(randomAction.getRandomNum()).isGreaterThanOrEqualTo(validationUtils.MIN_NUMBER);
        assertThat(randomAction.getRandomNum()).isLessThanOrEqualTo(validationUtils.MAX_NUMBER);
    }

    @Test
    @DisplayName("랜덤 숫자로 인한 action값 테스트")
    void actionTest(){
        int goNum = 9;
        int stopNum = 0;
        assertThat(randomAction.getCarAction(goNum)).isEqualTo(RacingCarAction.GO);
        assertThat(randomAction.getCarAction(stopNum)).isEqualTo(RacingCarAction.STOP);
    }
}
