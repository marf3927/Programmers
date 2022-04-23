package Level1;
import java.util.*;

// 정수 내림차순으로 배치하기
public class IntDescOrder {
    public long solution(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        Arrays.sort(charArray);

        return Long.parseLong(new StringBuilder(new String(charArray)).reverse().toString());
    }
}
