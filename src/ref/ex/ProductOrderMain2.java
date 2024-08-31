package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부",2000,2);
        orders[1]  = createOrder("김치",5000,1);
        orders[2] = createOrder("고구마",3000,3);
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
