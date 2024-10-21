package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        start();

    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("=================================");
            System.out.println("1.입금| 2.출금| 3.잔액 확인| 4.종료");
            System.out.println("=================================");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            balance = balance(choice, balance);
            if (choice == 4) {
                break;
            }

        }
    }

    public static int balance(int choice, int balance) {
        Scanner sc = new Scanner(System.in);
        int inout;
        if (choice == 1) {
            System.out.print("입금액을 입력하세요: ");
            inout = sc.nextInt();
            balance += inout;
            System.out.println(inout + "을 입금하였습니다. 현재 잔액: " + balance);
            return balance;

        } else if (choice == 2) {
            System.out.print("출금액을 입력하세요: ");
            inout = sc.nextInt();
            if (inout > balance) {
                System.out.println(inout + "원을 출금하려 했으나 잔액이 부족합니다.");
            } else {
                balance -= inout;
                System.out.println(inout + "원을 출금하였습니다. 현재 잔액:" + balance);
            }
            return balance;
        } else if (choice == 3) {
            System.out.print("현재잔액: " + balance);
            System.out.println();

        } else if (choice == 4) {

            System.out.println("시스템 종료");

        }
        else{
            System.out.println("잘못된 번호입니다.");
        }
        return balance;
    }

}

