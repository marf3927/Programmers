package Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// hashmap 사용하기
public class 실패율 {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double>map = new HashMap<>(N);
        int up = 0;
        for(int i=1; i<=N; i++){
            double fail = 0;
            for(int j=0; j<stages.length; j++){
                if(stages[j]==i){
                    fail++;
                }
            }
            map.put(i, fail==0 ? 0 :fail/(stages.length-up));
            up += fail;
        }
        List<Integer> answer = new ArrayList<>(map.keySet());
        answer.sort((value1, value2) -> (map.get(value2).compareTo(map.get(value1))));
        return answer.stream().mapToInt(i->i).toArray();
    }
}
