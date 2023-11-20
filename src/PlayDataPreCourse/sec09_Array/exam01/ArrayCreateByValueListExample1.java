package PlayDataPreCourse.sec09_Array.exam01;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열 참조 변수
        int[] scores = {83, 90, 87};

        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }

        System.out.println("sum = " + sum);

        double avg = (double) sum / 3;
        System.out.println("avg = " + avg);
    }

    /*
        scores[0] = 83
        scores[1] = 90
        scores[2] = 87
        sum = 260
        avg = 86.66666666666667
     */
}
