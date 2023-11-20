package PlayDataPreCourse.sec05_Operator.exam03;

public class DenyLogicOperatorExample {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);

        play = !play;
        System.out.println("play = " + play);
    }

    /*
        play = true
        play = false
        play = true
    */
}
