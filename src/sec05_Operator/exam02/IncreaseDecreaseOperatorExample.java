package sec05_Operator.exam02;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z;

        System.out.println("------------------------");
        x++;  // x = 1
        ++x;  // x = 2
        System.out.println("x = " + x);

        System.out.println("------------------------");
        y--;  // y = -1
        --y;  // y = -2
        System.out.println("y = " + y);

        System.out.println("------------------------");
        z = ++x + y++;    // 3 + (-2)  -> 1
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    /*
        ------------------------
        x = 2
        ------------------------
        y = -2
        ------------------------
        z = 1
        x = 3
        y = -1
    */
}
