package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        int depositAmount = 1000; //입금 금액 : 1000원
        int withdrawAmount = 2000; //출금 금액 : 2000원

        //입금
        balance = deposit(balance, depositAmount);

        //출금
        balance = withdraw(balance, withdrawAmount);

        //최종
        System.out.println("최종 잔액: " + balance + "원");

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
