package Level1;

import java.util.ArrayList;

// 문자열 정수로 바꾸기
public class StringToInt {
    public int solution(String s) {
        int answer = 0;
        char[] chars = s.toCharArray();
        ArrayList<Integer> ints = new ArrayList<>();
        int a = 1;
        for(char i : chars){
            if(i == '-') a = -1;
            else if(i == '+') {
            }
            else {
                ints.add(Character.getNumericValue(i));
            }
        }
        for (Integer anInt : ints) {
            answer = answer * 10 + anInt;
        }
        return answer*a;
    }
}
