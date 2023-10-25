package sec04_InputOutput.exam02;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode = " + keyCode);
    }

    /*
        k (입력)
        keyCode = 107
        keyCode = 10
        k (입력)
        keyCode = 107
    */
}
