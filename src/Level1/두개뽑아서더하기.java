package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public void main(int[] args) {
        solution(new int[]{2, 1, 3, 4, 1});
    }

    public int[] solution(int[] numbers) {
        ArrayList arrayList = new ArrayList();
        Arrays.stream(numbers).sorted();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(!arrayList.contains(numbers[i]+numbers[i+j])) {
                    arrayList.add(numbers[i] + numbers[j]);
                }
            }
        }

        return arrayList.stream().mapToInt(i -> (int) i).sorted().toArray();
    }
}
