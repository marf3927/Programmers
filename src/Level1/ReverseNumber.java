package Level1;
import java.util.*;

// 자릿수 뒤집어 배열로 만들기
public class ReverseNumber {
    public int[] solution(long n) {
        String[] s = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] answer = new int[s.length];
        for(int i = 0; i < s.length; i++ ){
            answer[i] = Integer.parseInt(s[i]);
        }
        return answer;
    }
}
