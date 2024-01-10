package Practical17;
import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private final Map<Integer, Order> ordersMap;

    public InventorySystem() {
        ordersMap = new HashMap<>();
    }

    public void placeOrder(Order order) {
        ordersMap.put(order.getOrderId(), order);
    }

    public void updateOrder(Order order) {
        ordersMap.put(order.getOrderId(), order);
    }

    public void cancelOrder(int orderId) {
        ordersMap.remove(orderId);
    }

    public void trackOrder(int orderId) {
        Order order = ordersMap.get(orderId);
        if (order != null) {
            System.out.println("Order details for Order ID: " + orderId);
            System.out.println(order);
        } else {
            System.out.println("Order with ID " + orderId + " not found.");
        }
    }

    // Calculate the total revenue
    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Order order : ordersMap.values()) {
            totalRevenue += order.getProductPrice() * order.getQuantity();
        }
        return totalRevenue;
    }

    //Print Order by status
    public void printOrdersByStatus(Order.OrderStatus status) {
        System.out.println("Orders with status " + status + ":");
        for (Order order : ordersMap.values()) {
            if (order.getStatus() == status) {
                System.out.println(order);
            }
        }
    }
}

