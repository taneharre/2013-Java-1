import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int tot = 0;
        for (int num : list) {
            tot = tot + num;
        }
        return tot;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int tot = 0;
        int i = 0;
        for (int num : list) {
            tot = tot + num;
            i++;
        }
        return (double)tot / i;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var = 0;
        double avg = average(list);
        for (double num : list) {
            var = var + ((num - avg) * (num - avg));
        }
        var = var/(list.size() -1);
        return var;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
