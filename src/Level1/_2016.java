package Level1;

public class _2016 {
    public String solution(int a, int b) {
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int d = 0;
        for(int i=1; i<a; i++){
            d += month[i-1];
        }
        d = d + b + 4;
        return day[d % 7];
    }
}
