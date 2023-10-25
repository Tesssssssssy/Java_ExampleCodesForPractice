package sec09_Array.exam02;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // 배열의 참조 변수를 먼저 선언
        int[] scores;
        scores = new int[] {83, 90, 86};

        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }

        System.out.println("sum1 = " + sum1);

        double avg1 = (double) sum1 / 3;
        System.out.println("avg1 = " + avg1);
    }

    /*
        sum1 = 259
        avg1 = 86.33333333333333
     */
}
