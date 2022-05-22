package Level1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int erased = 0;
        int hit = 0;
        for (int j : lottos){
            if(j==0){
                erased++;
            }else if(Arrays.stream(win_nums).anyMatch(i->i==j)){
                hit++;
            }
        }
        int[] answer = {(7-(hit+erased)==7)?6:7-(hit+erased), (7-hit==7)?6: 7-hit};
        return answer;
    }
}
