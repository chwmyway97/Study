package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int number1 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int number2 = input.nextInt();

        //number1이 number2보다 큰 경우, 두 숫자를 교환합니다.
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = number1; i <= number2; i++) {
            System.out.print(i);
            if (i != number2) {
             System.out.print(",");
            }
        }

    }
}
