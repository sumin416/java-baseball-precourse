package baseball.model;

import java.util.HashSet;
import java.util.Set;

public class Score {
    private static final int LEN = 3;
    private int strike;
    private int ball;

    public Score() {
        initScore();
    }

    private void initScore() {
        strike = 0;
        ball = 0;
    }

    public void calScore(String computeValue, String userValue) {
        initScore();

        calStrike(computeValue, userValue);
        calBall(computeValue, userValue);
    }

    private void calStrike(String computeValue, String userValue) {
        for (int i = 0; i < 3; i++) {
            strike += isSameDigit(computeValue.charAt(i), userValue.charAt(i));
        }
    }

    private int isSameDigit(char ch1, char ch2) {
        if (ch1 == ch2) {
            return 1;
        }
        return 0;
    }

    private void calBall(String computeValue, String userValue) {
        Set<Character> digits = new HashSet<>();

        for (int i = 0; i < LEN; i++) {
            digits.add(computeValue.charAt(i));
            digits.add(userValue.charAt(i));
        }

        ball = 2 * LEN - digits.size() - strike;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    @Override
    public String toString() {
        return "Score{" +
                "strike=" + strike +
                ", ball=" + ball +
                '}';
    }
}
