package Level1;

import java.util.ArrayList;

public class RemoveSameInt {
    public int[] solution(int []arr) {
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i : arr){
            if(arrayList.size() == 0)arrayList.add(i);
            else if(arrayList.get(arrayList.size() - 1) != i) arrayList.add(i);
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
