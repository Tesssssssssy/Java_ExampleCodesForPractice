package PlayDataPreCourse.sec01_Variable.exam02;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시간" + minute + "분");

        int totalMinute = (hour * 60) + minute;

        System.out.println("totalMinute = " + totalMinute);
    }

    /*
        3시간5분
        totalMinute = 185
    */
}
