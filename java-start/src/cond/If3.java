package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 20) {
            System.out.println("성인");
        } else if (17 <= age) {
            System.out.println("고등학생");
        } else if (14 <= age) {
            System.out.println("중학생");
        } else if (8 <= age) {
            System.out.println("초등학생");
        } else {
            System.out.println("미취학");
        }
    }
}
