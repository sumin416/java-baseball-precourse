package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreTest {
    @Test
    void 스트라이크_점수가_맞게_계산되는지_검증() {
        // GIVEN
        String computerValue = "127";
        String userValue = "157";

        // WHEN
        Score score = new Score();
        score.calScore(computerValue, userValue);

        // THEN
        Assertions.assertEquals(2, score.getStrike());
    }
}
