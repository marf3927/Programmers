package Level1;

// 평균 구하기
public class GetAverage {
    public double solution(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum / (arr.length*1.0);
    }
}
