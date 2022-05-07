package Level1;

import java.util.Arrays;

public class MinRectangle {
    public int solution(int[][] sizes) {
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        for(int i=0; i<sizes.length; i++){
            w[i] = Math.max(sizes[i][0], sizes[i][1]);
            h[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        return Arrays.stream(w).max().getAsInt() * Arrays.stream(h).max().getAsInt();
    }
}
