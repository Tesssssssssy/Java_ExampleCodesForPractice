package sec11_ClassObject.exam02;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();

        System.out.println("제조사: " + myCar.company);
        System.out.println("모델명: " + myCar.model);
        System.out.println("색상: " + myCar.color);
        System.out.println("최고속도: " + myCar.maxSpeed);
        System.out.println("현재속도: " + myCar.speed);

        // 필드 값 변경
        myCar.speed = 60;
        System.out.println("\n수정된 속도: " + myCar.speed);
    }

    /*
        제조사: 현대자동차
        모델명: 그랜저
        색상: 검정
        최고속도: 350
        현재속도: 0

        수정된 속도: 60
    */
}
