package Level1;
import java.util.Arrays;

public class DartGame {
    public int solution(String dartResult) {
        dartResult = dartResult.replace("10", "a");
        char[] chars = dartResult.toCharArray();
        int[] scores = new int[3];
        int t = 0;

        for(char i : chars){
            String c = Character.toString(i);
            if(c.matches("[0-9]|[a]")){
                t++;
                if(c.equals("a")){
                    scores[t-1] = 10;
                }else {
                    scores[t-1] = Integer.parseInt(c);
                }
            }
            if(c.matches("[SDT]")) {
                if (c.equals("D")) {
                    scores[t-1] = (int) Math.pow(scores[t-1], 2);
                }
                if (c.equals("T")) {
                    scores[t-1] = (int) Math.pow(scores[t-1], 3);
                }
            }
            if(c.equals("#")){
                scores[t-1] = scores[t-1] * -1;
            }
            if(c.equals("*")){
                if(t>1){
                    scores[t-1] *= 2;
                    scores[t-2] *= 2;
                } else {
                    scores[t-1] *= 2;
                }
            }
        }
        return Arrays.stream(scores).sum();
    }
}
