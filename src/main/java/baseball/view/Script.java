package baseball.view;

public enum Script {

    input("숫자를 입력해주세요 : "),
    win("3개의 숫자를 모두 맞히셨습니다! 게임 끝"),
    over("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String ment;

    Script(String ment) {
        this.ment = ment;
    }

    public String getMent() {
        return ment;
    }
}
