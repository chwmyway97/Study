package cond;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;


        int coupon1 =switch (grade) {
            case 1 -> coupon1 = 1000;
            case 2 -> coupon1 = 2000;
            case 3 -> coupon1 = 3000;
            default -> coupon1 = 500;
        };

        System.out.println("coupon = " + coupon1);
    }
}
