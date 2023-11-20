package PlayDataPreCourse.sec02_Type.exam07;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // float var1 = 3.14;        // double 타입 리터럴을 float 변수에 대입하려고 했더니 컴파일 에러
        float var2 = 3.14f;
        double var3 = 3.14;

        // 정밀도 테스트
        float var4 = 0.123456789123456789f;
        double var5 = 0.123456789123456789;

        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);

        /*
            var2 = 3.14
            var3 = 3.14
            var4 = 0.12345679
            var5 = 0.12345678912345678
        */
    }
}
