import java.util.ArrayList;
import java.util.List;

public class Jaba {
    public static void main(String[] args) {
        int[][] test = {{1,2,3,4}, {4,5,6,8},{7,8,9,10}};

        System.out.println(test.length);

        List<Integer> a = new ArrayList();

        a.add(1);
        a.add(0);
        a.add(6);
        a.add(3);
        a.add(0);
        a.add(0);

        a.stream().filter(i -> i !=0);


    }
}
