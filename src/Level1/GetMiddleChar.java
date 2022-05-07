package Level1;

public class GetMiddleChar {
    public String solution(String s) {
        int len = s.length();
        return len%2==0 ? s.substring(len/2-1, len/2+1) : s.substring(len/2, len/2+1);
    }
}
