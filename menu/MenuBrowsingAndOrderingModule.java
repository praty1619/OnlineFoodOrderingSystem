// MenuBrowsingAndOrderingModule.java
package OnlineFoodOrderingSystem.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuBrowsingAndOrderingModule {
    private Map<String, List<MenuItem>> menuMap;

    public MenuBrowsingAndOrderingModule() {
        this.menuMap = new HashMap<>();
    }

    public void addMenuItem(String restaurantName, String itemName, double price) {
        MenuItem menuItem = new MenuItem(itemName, price);
        if (!menuMap.containsKey(restaurantName)) {
            menuMap.put(restaurantName, new ArrayList<>());
        }
        menuMap.get(restaurantName).add(menuItem);
    }

    public List<MenuItem> browseMenu(String restaurantName) {
        return menuMap.getOrDefault(restaurantName, new ArrayList<>());
    }
}
