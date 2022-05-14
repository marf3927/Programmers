package Level1;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] s = new int[n];
        Arrays.fill(s, 1);
        for(int i : lost){
            s[i-1] -= 1;
        }
        for(int i : reserve){
            s[i-1] += 1;
        }
        for (int i=0; i<s.length; i++){
            if(s[i]==0){
                if(i>0 && s[i-1]>1){
                    s[i]+=1;
                    s[i-1]-=1;
                }
                if(i<s.length-1&& s[i+1]>1){
                    s[i]+=1;
                    s[i+1]-=1;
                }
            }
        }
        int answer = 0;
        for(int i : s){
            if(i>=1){
                answer += 1;
            }
        }
        return answer;
    }
}
