package oop1;
//클래스와 메서드
//데이터랑 기능이 떨어져 있는 코드
public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);

        System.out.println("최종 숫자=" + valueData.value);

    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value=" + valueData.value);
    }

}
