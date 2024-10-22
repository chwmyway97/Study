package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        start();

    }

    public static void start() {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int amount = 0;

        while (true) {
            System.out.println("=================================");
            System.out.println("1.입금| 2.출금| 3.잔액 확인| 4.종료");
            System.out.println("=================================");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    amount = sc.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.print("현재잔액: " + balance);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    return;
                default:
                    System.out.println("잘못된 번호 선택");
                    break;
            }
        }


    }

    //입금
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    //출금
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");

        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

}

