package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    private String racingCarName;
    private int racingCarPosition;
    private RacingCar racingCar;

    @BeforeEach
    void setUp(){
        racingCarName = "pobi";
        racingCarPosition = 0;
    }

    @Test
    @DisplayName("레이싱카 생성")
    void makeRacingCar(){
        racingCar = new RacingCar(racingCarName, racingCarPosition);
        assertThat(racingCar.getRacingCarName()).isEqualTo(racingCarName);
        assertThat(racingCar.getRacingCarPosition()).isEqualTo(racingCarPosition);
    }
}
