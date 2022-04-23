package Level2;

// N개의 최소공배수
public class LCMofNumbers {
    public int getGcd(int a, int b){
        while (b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1; i<arr.length; i++){
            answer = answer*arr[i]/getGcd(answer, arr[i]);
            System.out.println(answer);
        }
        return answer;
    }
}
