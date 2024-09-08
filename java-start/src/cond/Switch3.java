package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
//        int coupon;
        int coupon1;

        switch (grade) {
            case 1:
                coupon1 =1000;
                break;
            case 2:
                coupon1 = 2000;
                break;

            case 3:
                coupon1 =3000;
                break;
            default:
                coupon1 =500;
                
        }

        System.out.println("coupon = " + coupon1);
    }
}
