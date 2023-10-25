package sec03_OperationAndPromotion.exam03;

public class ByteOperationExample {
    public static void main(String[] args) {
        byte res1 = 10 + 20;
        System.out.println(res1);

        byte x = 10;
        byte y = 20;
        int res2 = x + y;         // byte와 byte의 연산은 int 타입으로 반환됨
        System.out.println("res2 = " + res2);
    }

    /*
        30
        res2 = 30
    */
}
