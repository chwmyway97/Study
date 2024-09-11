package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while (count < 10) {
            num += 2;
            count++;
            System.out.println(num);
        }
        for (int num1 = 2, count1 = 1; count1 <= 10; num1 += 2, count1++) {
            System.out.println(num1);
        }
        //이 코드가 가독성이 좋다
        int num2 = 2;
        for (int count2 = 1; count2 <= 10; count2++) { //증가하는 변수만 넣어주는 것이 좋다
            System.out.println(num2);
            num2 += 2;
        }
    }
}
