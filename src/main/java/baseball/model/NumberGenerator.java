package baseball.model;

import nextstep.utils.Randoms;

import java.util.HashSet;
import java.util.Set;

public final class NumberGenerator {

    private static final int LEN = 3;

    public static String generate() {
        String computerValue;

        do {
            computerValue = Integer.toString(Randoms.pickNumberInRange(123, 987));
        } while (!isValid(computerValue));
        return computerValue;
    }

    public static boolean isNotValid(String value) {
        return !isValid(value);
    }

    public static boolean isValid(String value) {
        if (value.length() != LEN || isExistZero(value) || !isUniqueDigit(value)) {
            return false;
        }

        return true;
    }

    private static boolean isExistZero(String value) {
        int idx = 0;
        char ch;

        do {
            ch = value.charAt(idx++);
        } while (idx < 3 && ch != '0');

        if (ch == '0') {
            return true;
        }
        return false;
    }

    private static boolean isUniqueDigit(String value) {
        Set<Character> digits = new HashSet<>();

        for (int i = 0; i < LEN; i++) {
            digits.add(value.charAt(i));
        }

        if (digits.size() < 3) {
            return false;
        }
        return true;
    }
}
