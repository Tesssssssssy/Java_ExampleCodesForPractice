package sec07_RepetitionAndCondition.exam07;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        // 8 <= ... < 12 (4 + 8)
        int time = (int) ((Math.random()) * 4) + 8;
        System.out.println("[현재 시간: " + time + " 시]");

        switch (time) {
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("회의");
            case 10:
                System.out.println("업무");
            default:
                System.out.println("외근");
        }
    }

    /*
        [현재 시간: 11 시]
        외근

        [현재 시간: 8 시]
        출근
        회의
        업무
        외근
    */
}
