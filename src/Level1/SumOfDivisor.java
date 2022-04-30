package Level1;

// 약수의 합
public class SumOfDivisor {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i*i <= n; i++){
            if(n%i == 0){
                answer += (i == (n/i)) ? i : i + (n/i);
            }
        }
        return answer;
    }
}
