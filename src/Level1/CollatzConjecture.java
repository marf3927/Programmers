package Level1;

// 콜라츠 추측
public class CollatzConjecture {
    public int solution(long num) {
        int answer = 0;
        while(answer<=500){
            if(num==1) return answer;
            num = (num%2 == 0) ? num/2 : (num*3)+1;
            answer++;
        }
        return -1;
    }
}
