package sec11_ClassObject.exam11;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("99999999", "홍길동");

        System.out.println("p1.nation = " + p1.nation);
        System.out.println("p1.ssn = " + p1.ssn);
        System.out.println("p1.name = " + p1.name);
        
        // p1.nation = "USA;
        // p1.ssn = "12345;
        // final로 명시된 값들은 변경 불가
        
        p1.name = "홍길동2";
        System.out.println("\nnew p1.name = " + p1.name);
    }

    /*
        p1.nation = Korea
        p1.ssn = 99999999
        p1.name = 홍길동

        new p1.name = 홍길동2
    */
}
