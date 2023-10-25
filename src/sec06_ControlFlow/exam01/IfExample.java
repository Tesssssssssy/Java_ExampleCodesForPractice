package sec06_ControlFlow.exam01;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A입니다.");
        }
        if(score < 90) {
            System.out.println("점수가 90점 이하입니다.");
            System.out.println("등급은 B입니다.");
        }

        /*
            점수가 90점 이상입니다.
            등급은 A입니다.
        */
    }
}
