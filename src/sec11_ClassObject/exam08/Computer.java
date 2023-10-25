package sec11_ClassObject.exam08;

public class Computer {
    int sum1(int[] values) {
        int sum = 0;
        for (int value: values) {
            sum += value;
        }
        return sum;
    }

    int sum2(int ... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
