package Level1;

// 하샤드의 수
public class HarshadNumber {
    public boolean solution(int x) {
        char[] list = String.valueOf(x).toCharArray();
        int sum = 0;
        for (char c : list) {
            sum += Character.getNumericValue(c);
        }
        return x % sum == 0;
    }
}
