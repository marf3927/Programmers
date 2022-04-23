package Level1;

// 최대공약수와 최소공배수
public class GCDLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int bn = m, sn = n;
        int i = 0;
        if(n > m){
            bn = n;
            sn = m;
        }
        while(bn%(sn-i) != 0 || sn%(sn-i) != 0){
            i++;
        }
        answer[0] = (sn-i);
        answer[1] = n*m/answer[0];

        return answer;
    }
}
