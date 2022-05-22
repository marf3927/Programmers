package Level1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] _1 = {1,2,3,4,5};
        int[] _2 = {2,1,2,3,2,4,2,5};
        int[] _3 = {3,3,1,1,2,2,4,4,5,5};
        int[] s = {0,0,0};
        ArrayList<Integer> answer = new ArrayList();
        for(int i=0; i<answers.length; i++){
            if(answers[i] == _1[i%_1.length]) s[0]++;
            if(answers[i] == _2[i%_2.length]) s[1]++;
            if(answers[i] == _3[i%_3.length]) s[2]++;
        }
        int max = 0;
        for(int i=0; i<3; i++){
            if(s[i]>max) max = s[i];
        }
        for(int i=0; i<3; i++){
            if(s[i]==max) answer.add(i+1);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
