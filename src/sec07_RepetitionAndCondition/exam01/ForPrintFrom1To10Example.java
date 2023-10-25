package sec07_RepetitionAndCondition.exam01;

public class ForPrintFrom1To10Example {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }
        System.out.println("1~10까지의 합 = " + result);
    }

    /*
        1~10까지의 합 = 55
    */
}
