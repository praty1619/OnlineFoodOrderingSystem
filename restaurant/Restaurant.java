package OnlineFoodOrderingSystem.restaurant;

public class Restaurant {
    private String name;
    private String cuisineType;
    private String location;
    private boolean isActive;

    public Restaurant(String name , String cuisineType , String location){
        this.name = name;
        this.cuisineType = cuisineType;
        this.location = location;
        this.isActive = true;
    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public String getCuisineType(){
        return cuisineType;
    }

    public void setCuisineType(String cuisineType){
        this.cuisineType = cuisineType;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}

