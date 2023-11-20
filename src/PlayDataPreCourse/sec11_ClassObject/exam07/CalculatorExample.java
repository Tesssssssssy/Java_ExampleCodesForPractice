package PlayDataPreCourse.sec11_ClassObject.exam07;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCals = new Calculator();
        myCals.powerOn();

        int res = myCals.plus(5, 6);
        System.out.println("res = " + res);

        byte x = 10;
        byte y = 4;
        double res2 = myCals.divide(x, y);
        System.out.println("res2 = " + res2);

        myCals.powerOff();
    }

    /*
        전원 on
        res = 11
        res2 = 2.5
        전원 off
    */
}
