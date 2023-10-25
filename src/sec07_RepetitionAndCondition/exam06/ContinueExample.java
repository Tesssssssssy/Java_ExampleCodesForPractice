package sec07_RepetitionAndCondition.exam06;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {   // 홀수
                continue;     // 홀수 일 때는 아래 프린트문 실행하지 않고 위 for문으로 돌아감.
            }
            System.out.println(i);
        }
    }
    /*
        2
        4
        6
        8
        10
    */
}
