package casting;

public class Casting2 {
    public static void main(String[] args) {
        int intValue = 0;
        long longValue;
        double doubleValue = 1.5;

        //intValue = doubleValue; // 컴파일 오류
        intValue = (int) doubleValue;//형변환
        System.out.println("intValue = " + intValue);

        System.out.println((int)10.5);
        System.out.println("doubleValue = " + doubleValue);
    }

}
