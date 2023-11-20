package PlayDataPreCourse.sec04_InputOutput.exam03;

import java.io.IOException;

public class ContinueKeyCodeReadExample {
    public static void main(String[] args) throws IOException {
        int keyCode;

        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }

    /*
        k
        keyCode: 107
        keyCode: 10
        s
        keyCode: 115
        keyCode: 10
        1
        keyCode: 49
        keyCode: 10
        (enter)
        keyCode: 10
    */
}
