package sec07_RepetitionAndCondition.exam04;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int)(Math.random() * 6) + 1;     // 1~6까지의 정수
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("무인도 탈출");
    }

    /*
        1
        6
        무인도 탈출
     */
}
