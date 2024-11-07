package ref.ex;


import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = input.nextInt();
        input.nextLine();
        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = input.nextLine();


            System.out.print("가격: ");
            int price = input.nextInt();


            System.out.print("수량: ");
            int quentity = input.nextInt();
            input.nextLine();//입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName,price,quentity);

        }

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);


    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productorder = new ProductOrder();
        productorder.productName = productName;
        productorder.price = price;
        productorder.quantity = quantity;
        return productorder;
    }

    static void printOrder(ProductOrder[] orders) {

        for (ProductOrder order : orders) {

            System.out.println("상품명: " + order.productName + ", 가격:" + order.price + ", 수량:" + order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }


}


