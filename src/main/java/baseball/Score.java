package baseball;

public class Score {
    private int strike;
    private int ball;

    public Score() {
        strike = 0;
        ball = 0;
    }

    void calScore(String computeValue, String userValue) {

        calStrike(computeValue, userValue);
    }


    private void calStrike(String computeValue, String userValue) {
        for (int i = 0; i < 3; i++) {
            if (computeValue.charAt(i) == userValue.charAt(i)) ++strike;
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
