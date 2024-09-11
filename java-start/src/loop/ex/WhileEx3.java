package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 3;
        int sum = 0;
        int num = 1;

        while (num <= max) {

            sum += num;
            num++;
        }
        System.out.println(sum);
        System.out.println();

        int max1 = 3;
        int sum1 = 0;
        for (int num1 = 1; num1 <= max1; num1++) {
            sum1 += num1;

        }
        System.out.println("max1 = " + sum1);

    }


}
