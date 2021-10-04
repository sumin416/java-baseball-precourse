package baseball;

import nextstep.utils.Randoms;

public final class NumberGenerator {

    static int generate() {
        int computerNum;

        while (true) {
            computerNum = Randoms.pickNumberInRange(123, 987);
            System.out.println("generate : " + computerNum);
            if (isValid(computerNum)) {
                break;
            }
        }

        return computerNum;
    }

    static boolean isValid(int num) {

        if (num < 123 || num > 987) {
            return false;
        }

        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;

        if (first == second || first == third || second == third) {
            return false;
        }
        return true;
    }
}
