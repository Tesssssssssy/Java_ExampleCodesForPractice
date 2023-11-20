package PlayDataPreCourse.sec10_EnumType.exam02;

import PlayDataPreCourse.sec10_EnumType.exam01.Week;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today = null;

        // 오늘의 요일을 int 값으로 얻는 코드
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.Sunday; break;
            case 2:
                today = Week.Monday; break;
            case 3:
                today = Week.Tuesday; break;
            case 4:
                today = Week.Wednesday; break;
            case 5:
                today = Week.Thursday; break;
            case 6:
                today = Week.Friday; break;
            case 7:
                today = Week.Saturday; break;
        }

        System.out.println("week = " + week);
        System.out.println("오늘 요일: " + today);

        if (today == Week.Sunday) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }

    /*
        week = 3
        오늘 요일: Tuesday
        열심히 자바 공부를 합니다.
    */
}
