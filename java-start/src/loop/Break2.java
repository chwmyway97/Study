package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) {

            if (sum > 10) {
                break;
            }
             sum += i;
            System.out.println("i= " + i +" sum = " + sum );
        }
        System.out.println(sum);
    }
}
