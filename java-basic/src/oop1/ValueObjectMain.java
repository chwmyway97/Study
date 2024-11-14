package oop1;
//클래스와 메서드
//데이터와 기능이 같이 있는 코드
public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();

        System.out.println("최종 숫자=" + valueData.value);

    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }

}
