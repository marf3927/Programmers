package Level1;

public class Rest1 {
    public int solution(int n) {
        int answer = 2;
        while ((n-1)%answer != 0){
            answer++;
        }
        return answer;
    }
}
