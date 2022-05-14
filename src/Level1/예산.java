package Level1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i<d.length && budget>= d[i]; i++){
            budget -= d[answer];
            answer++;
        }
        return answer;
    }
}
