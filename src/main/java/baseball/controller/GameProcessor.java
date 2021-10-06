package baseball.controller;

import baseball.NumberGenerator;
import baseball.Score;
import baseball.User;
import baseball.model.Result;
import baseball.view.Hint;
import baseball.view.Script;

public class GameProcessor {
    String computer;
    String user;
    StringBuilder result;

    public GameProcessor() {
        this.result = new StringBuilder();
    }

    public void play(){
        Score score = new Score();
        while (true){
            computer = NumberGenerator.generate();

            while(true){
                System.out.print(Script.input.getMent());
                user = User.getNewUserValue();
                if(NumberGenerator.isNotValid(user)){
                    System.out.println(Hint.ERROR);
                    continue;
                }


                score.calScore(computer, user);
                int strikeResult = score.getStrike();
                int ballResult = score.getBall();

                if(strikeResult == 0 && ballResult == 0){
                    System.out.println(Hint.낫싱);
                    continue;
                }

                result.setLength(0);

                if(strikeResult!=0) {
                    result.append(strikeResult).append(Result.스트라이크).append(" ");
                }
                if(ballResult!=0)
                    result.append(ballResult).append(Result.볼);

                System.out.println(result.toString());

                if(strikeResult == 3)
                    break;
            }

            System.out.println(Script.win.getMent());
            System.out.println(Script.over.getMent());
            if(User.getNewUserValue().equals("1"))  continue;
            break;
        }
    }
}
