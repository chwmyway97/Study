package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);//5
        number = changeNumber(number);
        System.out.println("4. chageNumber 호출 후, number: " + number);//5
    }

    public static int changeNumber(int number) {
        System.out.println("2. chageNumber 변경 전, number: " + number);//5
        number = number * 2;
        System.out.println("3. chageNumber 변경 후, number: " + number);//10
        return number;
    }

    //main의 number와 changeNumber의 number는 서로 다른 메모리를 가진다.
    //changeNumber의 number는 지역변수이다.
}
