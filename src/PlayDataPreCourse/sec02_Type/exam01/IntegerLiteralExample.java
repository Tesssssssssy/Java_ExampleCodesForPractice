package PlayDataPreCourse.sec02_Type.exam01;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011;     // 2진수: 0b or 0B로 시작하고 그 뒤에는 0~1 사이의 숫자만 올 수 있다.
        int var2 = 0203;       // 8진수: 0으로 시작하고 그 뒤에는 0~7 사이의 숫자만 올 수 있다.
        int var3 = 365;        // 10진수
        int var4 = 0xB3;       // 16진수: 0x or 0X로 시작하고 그 뒤에는 0~9 사이의 숫자 혹은 알파벳 a~f(A~F)만 올 수 있다.

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);

        /*
            var1 = 11
            var2 = 131
            var3 = 365
            var4 = 17
        */
    }
}
