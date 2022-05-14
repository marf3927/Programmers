package Level1;

import java.util.ArrayList;

public class _3진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = 1;
        while(n!=0) {
            arrayList.add(n%3);
            n /= 3;
        }

        for(int i=arrayList.size()-1; i>=0; i--) {
            answer += arrayList.get(i) * a;
            a *= 3;
        }
        return answer;
    }
}
