package sec05_Operator.exam05;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean res1 = (num1 == num2);
        boolean res2 = (num1 != num2);
        boolean res3 = (num1 <= num2);
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);

        char char1 = 'A';
        char char2 = 'B';
        boolean res4 = (char1 < char2);
        System.out.println("res4 = " + res4);
    }

    /*
        res1 = true
        res2 = false
        res3 = true
        res4 = true
     */
}
