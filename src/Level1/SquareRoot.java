package Level1;

// 정수의 제곱근 판별
public class SquareRoot {
    public long solution(long n) {
        return (Math.sqrt(n)%1 != 0) ? -1 : (long) Math.pow(Math.sqrt(n) + 1, 2);
    }
}
