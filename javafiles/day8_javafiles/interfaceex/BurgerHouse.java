package interfaceex;

public class BurgerHouse implements Zomato {

    String name;
    String location;


    public BurgerHouse(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void getFoodItem(String restName, String foodName) {
        System.out.println("Welcome to "+restName+", ordering cook to  prepare "+foodName+"...");
    }

    @Override
    public void giveFoodSpecification(String restName, String foodName, String instruction) {
        System.out.println("cook to follow instruction below while preparing burger:"+foodName);
        System.out.println(instruction);
    }
}
