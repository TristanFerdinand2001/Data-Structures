package Practical17;

public class User {
    public static void main(String[] args) {
        ///The two inventory systems
        InventorySystem inventorySystem1 = new InventorySystem();
        InventorySystem inventorySystem2 = new InventorySystem();

        //Creating order objects
        Order order1 = new Order(1,"Product 1",10.50,3);
        Order order2 = new Order(2,"Product 2",15.00,2);
        Order order3 = new Order(3,"Product 3",20.50,1);
        Order order4 = new Order(4,"Product 4",26.00,1);


        //Placing orders
        inventorySystem1.placeOrder(order1);
        inventorySystem1.placeOrder(order2);
        inventorySystem2.placeOrder(order3);
        inventorySystem2.placeOrder(order4);

        //Setting the status of an order
        order1.setStatus(Order.OrderStatus.SHIPPED);
        order2.setStatus(Order.OrderStatus.DELIVERED);
        order3.setStatus(Order.OrderStatus.PENDING);
        order4.setStatus(Order.OrderStatus.SHIPPED);

        //Updating an Order
        inventorySystem1.updateOrder(order2);
        ///Cancelling an order
        inventorySystem1.cancelOrder(4);
        //Tracking an order
        inventorySystem2.trackOrder(4);

        ///Printing the status of two orders
        inventorySystem2.printOrdersByStatus(Order.OrderStatus.PENDING);
        inventorySystem1.printOrdersByStatus(Order.OrderStatus.DELIVERED);

        System.out.println("------------------------------------" +
                "------------------------------------\n");

        /// Calculate total revenue for both inventory systems
        double totalRevenue1 = inventorySystem1.calculateTotalRevenue();
        double totalRevenue2 = inventorySystem2.calculateTotalRevenue();
        System.out.println("Total Revenue for Inventory System 1: " + totalRevenue1);
        System.out.println("Total Revenue Inventory System 2: " + totalRevenue2);

    }
}
