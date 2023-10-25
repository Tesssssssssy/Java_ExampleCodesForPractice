package sec05_Operator.exam04;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int res1 = v1 + v2;
        System.out.println("res1 = " + res1);

        int res2 = v1 - v2;
        System.out.println("res2 = " + res2);

        int res3 = v1 * v2;
        System.out.println("res3 = " + res3);

        int res4 = v1 / v2;
        System.out.println("res4 = " + res4);

        int res5 = v1 % v2;
        System.out.println("res5 = " + res5);

        double res6 = (double) v1 / v2;
        System.out.println("res6 = " + res6);
    }

    /*
        res1 = 7
        res2 = 3
        res3 = 10
        res4 = 2
        res5 = 1
        res6 = 2.5
    */
}
