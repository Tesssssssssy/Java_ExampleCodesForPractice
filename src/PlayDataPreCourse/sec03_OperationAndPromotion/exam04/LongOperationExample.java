package PlayDataPreCourse.sec03_OperationAndPromotion.exam04;

public class LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long res = value1 + value2 + value3;       // long 타입이 가장 범위가 넓으므로 연산 결과는 long 타입으로 반환
        System.out.println("res = " + res);
    }

    /*
        res = 1110
    */
}
