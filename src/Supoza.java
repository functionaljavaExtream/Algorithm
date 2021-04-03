public class Supoza {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int answerslen = answer.length;

        int[] p1 = {1,2,3,4,5}; // 5
        int[] p2 = {2,1,2,3,2,4,2,5}; // 8
        int[] p3 = {3,3,1,1,2,2,4,4,5,5}; // 10
        int score1  = 0;
        int score2  = 0;
        int score3  = 0;

        int a = answerslen/5;
        int b = answerslen%5;
        int index = 0;
        for (int i = 0; i < a; i++) {

            if (1 == answer[index]) {
                ++score1;
            }
            index += 10;
        }




        return answer;
    }
}
