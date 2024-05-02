// Main.java
package onlineFoodOrderingSystem;

import OnlineFoodOrderingSystem.delivery.DeliveryManagementModule;
import OnlineFoodOrderingSystem.menu.MenuBrowsingAndOrderingModule;
import OnlineFoodOrderingSystem.restaurant.RestaurantManagementModule;

public class Main {
    public static void main(String[] args) {
        // Create an instance of RestaurantManagementModule
        RestaurantManagementModule restaurantModule = new RestaurantManagementModule();

        // Add restaurants
        restaurantModule.addRestaurant("Restaurant A", "Italian", "123 Main St");
        restaurantModule.addRestaurant("Restaurant B", "Chinese", "456 Elm St");

        // Update a restaurant
        restaurantModule.updateRestaurant("Restaurant A", "Italian-American", "123 Main St");

        // Deactivate a restaurant
        restaurantModule.deactivateRestaurant("Restaurant B");

        // Print the list of added restaurants (for testing purposes)
        System.out.println("List of Restaurants:");
        restaurantModule.getRestaurantMap().forEach((name, restaurant) -> {
            System.out.println("Restaurant Name: " + name);
            System.out.println("Cuisine Type: " + restaurant.getCuisineType());
            System.out.println("Location: " + restaurant.getLocation());
            System.out.println("Active: " + restaurant.isActive());
            System.out.println();
        });

        // Create an instance of MenuBrowsingAndOrderingModule
        MenuBrowsingAndOrderingModule menuModule = new MenuBrowsingAndOrderingModule();

        // Add menu items to Restaurant A
        menuModule.addMenuItem("Restaurant A", "Pizza", 10.99);
        menuModule.addMenuItem("Restaurant A", "Pasta", 8.99);

        // Browse menu of Restaurant A
        System.out.println("Menu of Restaurant A:");
        menuModule.browseMenu("Restaurant A").forEach(item -> {
            System.out.println("Item: " + item.getName() + ", Price: $" + item.getPrice());
        });

        // Create an instance of DeliveryManagementModule
        DeliveryManagementModule deliveryModule = new DeliveryManagementModule();

        // Add orders
        deliveryModule.addOrder("1", "customer1", "Restaurant A", "123 Elm St");
        deliveryModule.addOrder("2", "customer2", "Restaurant B", "456 Oak St");

        // Get orders assigned to a delivery agent
        System.out.println("Orders assigned to Delivery Agent 001:");
        deliveryModule.getOrdersForDeliveryAgent("001").forEach(order -> {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Customer ID: " + order.getCustomerId());
            System.out.println("Restaurant Name: " + order.getRestaurantName());
            System.out.println("Delivery Address: " + order.getDeliveryAddress());
            System.out.println("Status: " + order.getStatus());
            System.out.println();
        });

        // Update the status of an order
        deliveryModule.updateOrderStatus("1", "Delivered");
    }
}
