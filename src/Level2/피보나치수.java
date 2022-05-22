package Level2;

public class 피보나치수 {
    public int solution(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i=1; i<n; i++){
            if(i==1){
                b = 1;
                c = 1;
            }else {
                a = b% 1234567;
                b = c% 1234567;
                c = a+b;
            }
        }
        return c%1234567;
    }
}
