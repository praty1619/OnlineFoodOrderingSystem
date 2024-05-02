// DeliveryManagementModule.java
package OnlineFoodOrderingSystem.delivery;

import java.util.ArrayList;
import java.util.List;

public class DeliveryManagementModule {
    private List<Order> orderList;

    public DeliveryManagementModule() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(String orderId, String customerId, String restaurantName, String deliveryAddress) {
        Order newOrder = new Order(orderId, customerId, restaurantName, deliveryAddress);
        orderList.add(newOrder);
    }

    public List<Order> getOrdersForDeliveryAgent(String deliveryAgentId) {
        List<Order> ordersForAgent = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getStatus().equals("Pending")) {
                ordersForAgent.add(order);
            }
        }
        return ordersForAgent;
    }

    public void updateOrderStatus(String orderId, String status) {
        for (Order order : orderList) {
            if (order.getOrderId().equals(orderId)) {
                order.setStatus(status);
                break;
            }
        }
    }
}
