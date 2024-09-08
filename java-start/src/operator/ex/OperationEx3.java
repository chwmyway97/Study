package operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 0;

        score =70;
        boolean result1 = (80<= score && score <= 100);
        System.out.println("result1 = " + result1);

        score = 100;
        boolean result2 = (score >= 80 && score <= 100);
        System.out.println("result2 = " + result2);
    }
}
