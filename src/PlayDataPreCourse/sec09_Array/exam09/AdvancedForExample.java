package PlayDataPreCourse.sec09_Array.exam09;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 99, 22, 98, 85};

        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        System.out.println("sum = " + sum);

        double avg = (double) sum / scores.length;

        System.out.println("avg = " + avg);
    }

    /*
        sum = 399
        avg = 79.8
    */
}
