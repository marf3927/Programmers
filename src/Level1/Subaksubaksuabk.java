package Level1;

public class Subaksubaksuabk {
    public String solution(int n) {
        String subak = "수박";
        String answer = subak.repeat(n/2);
        if(n % 2==1){
            answer += "수";
        }
        return answer;
    }
}
