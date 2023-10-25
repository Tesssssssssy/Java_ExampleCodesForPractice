package sec05_Operator.exam01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int res1 = +x;
        int res2 = -x;
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);

        byte b = 100;
        // byte res3 = +b;    // byte 타입에 대한 연산 결과는 int 타입이므로 byte 타입 변수에 결과를 담을 수 없다.
        int res3 = +b;
        System.out.println("res3 = " + res3);
    }

    /*
        res1 = -100
        res2 = 100
        res3 = 100
    */
}
