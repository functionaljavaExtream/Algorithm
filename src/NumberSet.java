import java.util.*;

public class NumberSet {
    public int[] solution(int[] numbers) {

        Set<Integer> answerSet = new TreeSet<>();

        for (int i = 0; i < numbers.length; ++i) {
            for (int z = i+1; z <  numbers.length; ++z) {
                int sum = numbers[i] + numbers[z];
                answerSet.add(sum);
            }
        }
        int[] answer = new int[answerSet.size()];
        int offset = 0;
        for (int value : answerSet) {
            answer[offset++] = value;
        }

        return answer;
    }
}
