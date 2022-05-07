package Level1;

public class SumBetweenTwoInt {
    public long solution(int a, int b) {
        long answer = 0;
        int bNum = Math.max(a, b);
        int sNum = Math.min(a, b);
        for(int i = sNum; i <= bNum; i++){
            answer+= i;
        }
        return answer;
    }
}
