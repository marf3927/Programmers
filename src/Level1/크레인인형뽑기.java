package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 크레인인형뽑기 {
    // Stack 사용
    public int solution1(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.peek() == board[j][move - 1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][move - 1]);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    // arrayList 사용
    public int solution2(int[][] board, int[] moves) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int answer = 0;
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move-1] != 0) {
                    if (list.get(list.size()-1) == board[j][move-1]) {
                        list.remove(list.size()-1);
                        answer += 2;
                    } else {
                        list.add(board[j][move-1]);
                    }
                    board[j][move-1] = 0;
                    break;
                }
            }
        }
        System.out.println(list.toString());
        return answer;
    }
}
