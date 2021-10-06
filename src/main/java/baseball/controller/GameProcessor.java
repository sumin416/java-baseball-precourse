package baseball.controller;

import baseball.model.NumberGenerator;
import baseball.model.Score;
import baseball.model.User;
import baseball.model.Result;
import baseball.view.Hint;
import baseball.view.Script;

public class GameProcessor {
    String computer;
    String user;
    Score score;
    StringBuilder result;

    public GameProcessor() {
        score = new Score();
        this.result = new StringBuilder();
    }

    public void gameStart() {
        do {
            computer = NumberGenerator.generate();
            userPlay();
        } while (User.getNewUserValue().equals("1"));
    }

    public void userPlay() {

        while (true) {
            System.out.print(Script.input.getMent());
            user = User.getNewUserValue();

            if (NumberGenerator.isNotValid(user)) {
                System.out.println(Hint.ERROR);
                continue;
            }

            score.calScore(computer, user);

            if (checkNothing()) continue;
            printResult();
            if (isThreeStrike()) break;

        }
    }

    private boolean checkNothing() {
        if (score.getStrike() == 0 && score.getBall() == 0) {
            System.out.println(Hint.낫싱);
            return true;
        }
        return false;
    }

    private void printResult() {

        int strikeResult = score.getStrike();
        int ballResult = score.getBall();

        result.setLength(0);

        if (strikeResult != 0) {
            result.append(strikeResult).append(Result.스트라이크).append(" ");
        }
        if (ballResult != 0)
            result.append(ballResult).append(Result.볼);

        System.out.println(result.toString());
    }

    private boolean isThreeStrike() {
        if (score.getStrike() == 3) {
            System.out.println(Script.win.getMent());
            System.out.println(Script.over.getMent());
            return true;
        }
        return false;
    }

}
