package Practical17;
public class Order extends InventorySystem {
    private int orderId;
    private String productName;
    private double productPrice;
    private int quantity;
    private OrderStatus status;

    public Order(int orderId, String productName, double productPrice, int quantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.status = OrderStatus.PENDING; /// Default status
    }

    // human-friendly representation
    @Override
    public String toString() {
        return "Order ID: " + orderId +
                ", Product: " + productName +
                ", Price per Item: " + productPrice +
                ", Quantity: " + quantity +
                ", Status: " + status;
    }

    //Storing the various OrderStatuses
    public enum OrderStatus {
        PENDING,
        PAID,
        SHIPPED,
        DELIVERED,
        REFUNDED
    }

    //Getters and setters
    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

