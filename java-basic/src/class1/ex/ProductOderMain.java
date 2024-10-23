package class1.ex;

public class ProductOderMain {
    public static void main(String[] args) {
        // 여러상품의 주문정보를 담는 배열 생성
        ProductOder[] productOrders = new ProductOder[3];

        // 상품 주문 정보를 "ProductOder' 타입의 변수로 받아 저장
        ProductOder productOder1 = new ProductOder();
        productOder1.productName = "두부";
        productOder1.price = 2000;
        productOder1.quantity = 2;
        productOrders[0] = productOder1;

        ProductOder productOder2 = new ProductOder();
        productOder2.productName = "김치";
        productOder2.price = 5000;
        productOder2.quantity = 1;
        productOrders[1] = productOder2;

        ProductOder productOder3 = new ProductOder();
        productOder3.productName = "김치";
        productOder3.price = 5000;
        productOder3.quantity = 1;
        productOrders[2] = productOder3;

        for (ProductOder p : productOrders) {

        }
        // 상품 주문 정보와 최종 금액 출력
        int totalAmount = 0;
        for (ProductOder p : productOrders) {
            totalAmount += p.price * p.quantity;
            System.out.println("상품명: " + p.productName + ", 가격:" + p.price + ", 수량:" + p.quantity);

        }
        System.out.println("총 결제 금액: " + totalAmount);

    }
}
