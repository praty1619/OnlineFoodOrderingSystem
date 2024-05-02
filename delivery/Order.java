// Order.java
package OnlineFoodOrderingSystem.delivery;

public class Order {
    private String orderId;
    private String customerId;
    private String restaurantName;
    private String deliveryAddress;
    private String status;

    public Order(String orderId, String customerId, String restaurantName, String deliveryAddress) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.restaurantName = restaurantName;
        this.deliveryAddress = deliveryAddress;
        this.status = "Pending";
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
