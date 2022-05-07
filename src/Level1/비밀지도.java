package Level1;

import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
    }

    public static int[][] getMap(int n, int[] arr){
        int[][] map = new int[n][n];
        for(int i=0; i<n; i++){
            char[] chars = new char[n];
            Arrays.fill(chars, '0');
            char[] binaryChars = Integer.toBinaryString(arr[i]).toCharArray();
            int diff = chars.length - binaryChars.length;
            System.arraycopy(binaryChars, 0, chars, 0 + diff, binaryChars.length);
            for(int j=0; j<n; j++){
                map[i][j] = Character.getNumericValue(chars[j]);
            }
        }
        return map;
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] map1 = getMap(n, arr1);
        int[][] map2 = getMap(n, arr2);
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                String s = map1[i][j]==0 && map2[i][j]==0 ? " " : "#";
                sb.append(s);
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
