package sec11_ClassObject.exam06;

public class Car {
    // 필드
    String company = "현대 자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {
    }

    public Car(String model) {
        // this.model = model;
        this(model, null, 0);
    }

    public Car(String model, String color) {
//        this.model = model;
//        this.color = color;
        this(model, color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
