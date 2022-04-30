package Level1;

public class NumberOfYnP {
    boolean solution(String s) {
        s = s.toLowerCase();
        int Y = 0;
        int P = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'y') Y++;
            if(s.charAt(i) == 'p') P++;
        }
        return Y==P;
    }
}
