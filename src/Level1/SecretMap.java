package Level1;

public class SecretMap {
    public int[][] getMap(int n, int[] arr){
        int[][] map = new int[n][n];
        for(int i=0; i<n; i++){
            char[] chars = Integer.toBinaryString(arr[i]).toCharArray();
            for(int j=0; j<n; j++){
                map[i][j] = Character.getNumericValue(chars[j]);
            }
        }
        return map;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
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
