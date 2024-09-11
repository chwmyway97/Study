package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 2;

        for (int i = 0; i < rows; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }


        }
    }
}
