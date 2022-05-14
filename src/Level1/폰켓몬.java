package Level1;

import java.util.Arrays;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int[] numsDist = Arrays.stream(nums).distinct().toArray();
        return Math.min(numsDist.length, (nums.length / 2));
    }
}
