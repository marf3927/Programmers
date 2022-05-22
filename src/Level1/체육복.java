package Level1;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int c[] = new int[n+2];
        for (int i : lost)
            c[i]--;
        for (int i : reserve)
            c[i]++;

        for (int i = 1; i < n+1; i++) {
            if (c[i] == -1)
                if (c[i - 1] == 1)
                    c[i - 1] = c[i] = 0;
                else if (c[i + 1] == 1)
                    c[i + 1] = c[i] = 0;
                else
                    answer--;
        }
        return answer;
    }
}
