package oop1.ex;

public class AccountProceduralMain {
    public static void main(String[] args) {
        int balance = 0;
        balance = deposit(balance, 10000);
        balance = withdraw(balance, 9000);
        balance = withdraw(balance, 2000);
    }

    static int deposit(int balance, int amount) {
        balance = balance + amount;

        return balance;
    }

    static int withdraw(int balance, int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " + balance);
        } else {
            balance = balance - amount;
        }
        return balance;
    }
}
