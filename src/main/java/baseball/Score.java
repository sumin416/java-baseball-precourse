package baseball;

public class Score {
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
            if (computeValue.charAt(i) == userValue.charAt(i)) ++strike;
        }
    }

    private void calBall(String computeValue, String userValue) {
        final int LEN = computeValue.length();
        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {
                if (i != j && computeValue.charAt(i) == userValue.charAt(j)) ++ball;
            }
        }
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
