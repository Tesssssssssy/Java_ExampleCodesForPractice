package sec03_OperationAndPromotion.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("'가'의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue);
    }

    /*
        intValue: 10
        '가'의 유니코드: 44032
        longValue: 50
        floatValue: 100.0
        doubleValue = 100.5
    */
}
