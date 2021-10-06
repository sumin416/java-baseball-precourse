package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreTest {

    private Score score;

    @BeforeEach
    void beforeEach() {
        score = new Score();
    }

    @Test
    void 스트라이크_점수가_맞게_계산되는지_검증() {
        // GIVEN
        String computerValue = "127";
        String userValue = "157";

        // WHEN
        score.calScore(computerValue, userValue);

        // THEN
        Assertions.assertEquals(2, score.getStrike());
    }

    @Test
    void 볼_점수가_맞게_계산되는지_검증() {
        // GIVEN
        String computerValue = "127";
        String userValue = "732";

        // WHEN
        score.calScore(computerValue, userValue);

        // THEN
        Assertions.assertEquals(2, score.getBall());
    }
}
