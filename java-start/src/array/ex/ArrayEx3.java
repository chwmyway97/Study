package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int[] temps = new int[5];



        System.out.println("5개의 정수를 입력하세요: ");

        for (int i = 0; i<numbers.length ; i++) {
            numbers[i] = scanner.nextInt();
            temps[4-i] = numbers[i];

        }


        System.out.println("입력한 정수를 역순으로 출력");
        for (int i = 0; i<numbers.length; i++) {

            numbers[i] = temps[i];
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
            
        }

    }
}
