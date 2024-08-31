package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 할 주문의 개수를 입력하세요");
        int n = scanner.nextInt();
        scanner.nextLine();


        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i<orders.length; i++ ){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");

            System.out.println("상품명");
            String productName = scanner.nextLine();

            System.out.println("가격");
            int price = scanner.nextInt();

            System.out.println("수량");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName,price,quantity);
        }


//        order1.productName = "두부";
//        order1.price = 2000;
//        order1.quantity = 2;
//        orders[0] = order1;
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 "+ totalAmount);

//        ProductOrder order2 = new ProductOrder();
//        order2.productName = "김치";
//        order2.price = 5000;
//        order2.quantity = 1;
//        orders[1] = order2;

//        ProductOrder order3 = new ProductOrder();
//        order3.productName = "고구마";
//        order3.price = 3000;
//        order3.quantity = 3;
//        orders[2] = order3;



    }

    static ProductOrder createOrder(String productName, int price , int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+ order.productName + ", 가격: "+ order.price + ", 양: "+ order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder [] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;

        }
        return totalAmount;
    }
}
