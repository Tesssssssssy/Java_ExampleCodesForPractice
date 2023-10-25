package sec06_ControlFlow.exam02;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;    // Math.random() : 0~1 미만의 소수를 구함
        // 0 * 6 <= num < 1 * 6
        // 0 + 1 <= num < 6 + 1
        // 1 <= num < 7 (정수)
        // 1~6까지의 정수를 랜덤하게 생성

        if (num == 1) {
            System.out.println("1번이 나왔습니다");
        } else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else if (num == 6) {
            System.out.println("6번이 나왔습니다.");
        }
    }

    /*
        실행할 때마다 결과가 다르게 나옴.
     */
}
