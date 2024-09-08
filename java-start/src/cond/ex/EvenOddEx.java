package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int num=3;

        String result = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println("result = " + result);
    }
}
