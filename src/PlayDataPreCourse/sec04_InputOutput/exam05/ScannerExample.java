package PlayDataPreCourse.sec04_InputOutput.exam05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputData;

        while (true) {
            inputData = scanner.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");
            if (inputData.equals("q")) {
                break;
            }
        }

        System.out.println("입력값이 q이므로 종료합니다");
    }


    /*
        a
        입력된 문자열: "a"
        b
        입력된 문자열: "b"
        1
        입력된 문자열: "1"
        d
        입력된 문자열: "d"
        k
        입력된 문자열: "k"
        q
        입력된 문자열: "q"
        입력값이 q이므로 종료합니다
    */
}
