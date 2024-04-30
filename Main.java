package OnlineFoodOrderingSystem;

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
    }
}
