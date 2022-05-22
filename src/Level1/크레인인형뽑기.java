package Level1;

import java.util.ArrayList;

public class 크레인인형뽑기 {
    // 7~11번 실패
    public int solution(int[][] board, int[] moves) {
        ArrayList arrayList = new ArrayList<Integer>();
        int answer = 0;
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (arrayList.size()>0 && Integer.parseInt(arrayList.get(arrayList.size()-1).toString()) == board[j][move-1]) {
                        arrayList.remove(arrayList.get(arrayList.size()-1));
                        answer += 2;
                        System.out.println(arrayList.toString());
                    } else {
                        arrayList.add(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        System.out.println(arrayList.toString());
        return answer;
    }
}
