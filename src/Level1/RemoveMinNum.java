package Level1;
import java.util.*;

// 제일 작은 수 제거하기
public class RemoveMinNum {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 1) return new int[] {-1};
        int min = arr[0];
        for (int j : arr) {
            list.add(j);
            if (min > j) {
                min = j;
            }
        }
        while(list.contains(min)){
            int idx = list.indexOf(min);
            list.remove(idx);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }
}
