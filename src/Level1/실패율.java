package Level1;

import java.util.Arrays;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) answer[i] = i+1;
        double[] failRate = new double[N];
        int up = 0;
        for(int i=1; i<=N; i++){
            double fail = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]==i){
                    fail++;
                }
            }
            failRate[i-1] = fail/(stages.length-up);
            up += fail;
        }
        for(int i=0; i<N; i++){
            for(int j=i+1; j < N; j++) {
                if(failRate[i] < failRate[j]){
                    double tempR = failRate[i];
                    failRate[i] = failRate[j];
                    failRate[j] =tempR;
                    int tempA = answer[i];
                    answer[i] = answer[j];
                    answer[j] =tempA;
                }
            }
        }
        return answer;
    }
}
