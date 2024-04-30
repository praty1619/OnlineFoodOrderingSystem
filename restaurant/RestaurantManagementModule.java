// RestaurantManagementModule.java
package OnlineFoodOrderingSystem.restaurant;

import java.util.HashMap;
import java.util.Map;

public class RestaurantManagementModule {
    private Map<String, Restaurant> restaurantMap;

    public RestaurantManagementModule() {
        this.restaurantMap = new HashMap<>();
    }

    public void addRestaurant(String name, String cuisineType, String location) {
        Restaurant newRestaurant = new Restaurant(name, cuisineType, location);
        restaurantMap.put(name, newRestaurant);
    }

    public void updateRestaurant(String name, String cuisineType, String location) {
        if (restaurantMap.containsKey(name)) {
            Restaurant restaurant = restaurantMap.get(name);
            restaurant.setCuisineType(cuisineType);
            restaurant.setLocation(location);
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    public void deactivateRestaurant(String name) {
        if (restaurantMap.containsKey(name)) {
            Restaurant restaurant = restaurantMap.get(name);
            restaurant.setActive(false);
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    public Map<String, Restaurant> getRestaurantMap() {
        return restaurantMap;
    }
}
