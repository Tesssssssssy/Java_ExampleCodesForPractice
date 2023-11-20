package PlayDataPreCourse.sec09_Array.exam04;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87, 20, 48, 50};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("sum = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("avg = " + avg);
    }

    /*
        sum = 378
        avg = 63.0
    */
}
