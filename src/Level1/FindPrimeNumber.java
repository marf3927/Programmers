package Level1;

import java.util.ArrayList;

public class FindPrimeNumber {
    public static boolean isPrime(int n){
        for(int i = 2 ; i*i <= n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i+=2){
            if(isPrime(i)) answer++;
        }
        return answer;
    }
}
