package Level2;

public class 숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int m = (int) Math.sqrt(n);
        for(int i=1; i<m; i++){
            if(n%i == 0){
                if(n%2 != 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}

