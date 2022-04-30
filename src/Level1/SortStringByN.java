package Level1;

import java.util.Arrays;

// 자릿수 더하기
public class SortStringByN {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        for(int i = 1; i < strings.length; i++){
            for (int j=i; j>0; j--){
                if(strings[j].charAt(n)-strings[j-1].charAt(n) < 0){
                    String temp = strings[j-1];
                    strings[j-1] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}
