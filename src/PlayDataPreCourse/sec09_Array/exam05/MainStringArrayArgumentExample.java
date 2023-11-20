package PlayDataPreCourse.sec09_Array.exam05;

public class MainStringArrayArgumentExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("값의 수가 부족합니다.");
            System.exit(0); // 프로그램 종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    /*
        값의 수가 부족합니다.       // 그대로 실행했을 때의 결과값
    */

    /*
        20 + 30 = 50
        // Run -> Edit Configurations -> Application -> Build and run -> 20 30 을 인자로 넘겨준 결과값
    */
}
