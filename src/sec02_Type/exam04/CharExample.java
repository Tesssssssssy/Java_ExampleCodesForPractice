package sec02_Type.exam04;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';         // char 리터럴 값을 char 변수에 초기화
        char c2 = 65;          // 10진수 정수 리터럴 값을 char 변수에 초기화
        char c3 = '\u0041';    // 16진수 정수 리터럴 값을 char 변수에 초기화
        char c4 = '가';        // char 리터럴 값을 char 변수에 초기화
        char c5 = 44032;       // 10진수 정수 리터럴 값을 char 변수에 초기화
        char c6 = '\uac00';    // 16진수 정수 리터럴 값을 char 변수에 초기화

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);

        /*
            c1 = A
            c2 = A
            c3 = A
            c4 = 가
            c5 = 가
            c6 = 가
        */
    }
}
