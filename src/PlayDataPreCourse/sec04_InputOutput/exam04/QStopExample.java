package PlayDataPreCourse.sec04_InputOutput.exam04;

import java.io.IOException;

public class QStopExample {
    public static void main(String[] args) throws IOException {
        int keyCode;

        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode = " + keyCode);

            if (keyCode == 113) {
                break;
            }
        }
        System.out.println("종료합니다");
    }
    /*
    k
    keyCode = 107
    keyCode = 10
    a
    keyCode = 97
    keyCode = 10
    s
    keyCode = 115
    keyCode = 10
    q
    keyCode = 113
    종료합니다     // q의 키코드가 113이므로 종료.
    */
}
