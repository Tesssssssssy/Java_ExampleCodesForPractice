package sec05_Operator.exam07;

public class LogicalOpearatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if ((charCode >= 65) & (charCode <= 90)) {
            System.out.println("대문자");
        }
        if ((charCode >= 97) & (charCode < 122)) {
            System.out.println("소문자");
        }
        if ((charCode < 48) & (charCode > 57)) {
            System.out.println("0~9 숫자");
        }
    }
    /*
        대문자
    */
}
