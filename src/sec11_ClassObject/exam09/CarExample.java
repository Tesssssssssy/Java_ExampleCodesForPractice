package sec11_ClassObject.exam09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();

        if (gasState) {
            System.out.println("출발합니다.");
            myCar.run();
        }

        if (myCar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입해주세요.");
        }
    }

    /*
        가스가 있습니다.
        출발합니다.
        달립니다. (gas 잔량: 5)
        달립니다. (gas 잔량: 4)
        달립니다. (gas 잔량: 3)
        달립니다. (gas 잔량: 2)
        달립니다. (gas 잔량: 1)
        멈춥니다. (gas 잔량: 0)
        가스가 없습니다.
        gas를 주입해주세요.
    */
}
