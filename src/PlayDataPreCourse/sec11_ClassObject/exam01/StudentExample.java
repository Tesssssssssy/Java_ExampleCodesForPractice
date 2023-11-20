package PlayDataPreCourse.sec11_ClassObject.exam01;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조한다");

        Student s2 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조한다");
    }
    /*
        s1 변수가 Student 객체를 참조한다
        s1 변수가 Student 객체를 참조한다
    */
}
