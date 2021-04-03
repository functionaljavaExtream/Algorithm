import java.util.*;

public class GameCrane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayDeque<Integer> answerQueue = new ArrayDeque<>();
        for(int move : moves) {
            int moveIndex = move - 1;

            for (int i = 0; i < board.length; ++i ) {
                int cell = board[i][moveIndex];
                if( cell == 0) {
                    continue;
                }
                try {
                    int last = answerQueue.getLast();
                    if(last == cell) {
                        answerQueue.removeLast();
                        answer += 2;
                    }else {
                        answerQueue.offerLast(cell);
                    }
                } catch (NoSuchElementException e) {
                    answerQueue.offerLast(cell);
                }
                board[i][moveIndex] = 0;
                break;


            }
        }

        return answer;
    }
}
