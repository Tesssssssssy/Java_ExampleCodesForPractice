package PlayDataPreCourse.sec02_Type.exam03;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;       // int 리터럴 값을 long 타입 변수에 대입
        long var2 = 20L;      // long 리터럴 값을 long 타입 변수에 대입
        // long var3 = 1000000000000;    // int 리터럴 값의 범위를 초과하면 컴파일 에러
        long var4 = 10000000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}
