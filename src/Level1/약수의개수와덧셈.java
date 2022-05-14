package Level1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        while (left <= right){
            int n = 0;
            for(int i = 1; i <= left; i++){
                if(left%i == 0){
                    n++;
                }
            }
            answer = (n%2==0)?answer+left : answer-left;
            left++;
        }
        return answer;
    }
}
