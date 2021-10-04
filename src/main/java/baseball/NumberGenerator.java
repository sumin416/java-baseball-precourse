package baseball;

import nextstep.utils.Randoms;

public final class NumberGenerator {

    static String generate() {
        String computerValue;

        while (true) {
            computerValue = Integer.toString(Randoms.pickNumberInRange(123, 987));
            if (isValid(computerValue)) {
                System.out.println("final: " + computerValue);
                break;
            }
        }

        return computerValue;
    }

    static boolean isValid(String value) {

        if (value.length() != 3) {
            return false;
        }

        char[] valueArray = value.toCharArray();

        for (char c : valueArray) {
            if (c == '0') return false;
        }

        final int len = 3;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (valueArray[i] == valueArray[j]) return false;
            }
        }

        return true;
    }
}