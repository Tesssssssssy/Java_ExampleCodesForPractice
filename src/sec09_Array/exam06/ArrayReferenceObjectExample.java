package sec09_Array.exam06;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArr = new String[3];

        strArr[0] = "java";
        strArr[1] = "java";
        strArr[2] = new String("java");

        System.out.println(strArr[0] == strArr[1]);
        System.out.println(strArr[0] == strArr[2]);
        System.out.println(strArr[0].equals(strArr[2]));
    }
    /*
        true
        false
        true
    */
}
