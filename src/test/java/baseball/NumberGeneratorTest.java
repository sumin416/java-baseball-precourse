package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGeneratorTest {

    @Test
    void 컴퓨터가_생성한_수가_조건에_맞는지_검증() {
        // GIVEN
        int falseExample1 = 112;
        int falseExample2 = 63;
        int trueExample = 163;

        // WHEN
        boolean falseExpected1 = NumberGenerator.isValid(falseExample1);
        boolean falseExpected2 = NumberGenerator.isValid(falseExample2);
        boolean trueExpected = NumberGenerator.isValid(trueExample);

        // THEN
        Assertions.assertThat(falseExpected1).isFalse();
        Assertions.assertThat(falseExpected2).isFalse();
        Assertions.assertThat(trueExpected).isTrue();
    }

}
