package Level1;

import java.util.Arrays;

public class DescString {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
