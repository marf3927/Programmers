package Level1;

import java.util.ArrayList;

public class DividedList {
    public int[] solution(int[] arr, int divisor) {
        ArrayList arrayList = new ArrayList();
        for (int i : arr){
            if(i%divisor == 0) arrayList.add(i);
        }
        return arrayList.size() !=0 ? arrayList.stream().mapToInt(i -> (int) i).sorted().toArray() : new int[]{-1};
    }
}
