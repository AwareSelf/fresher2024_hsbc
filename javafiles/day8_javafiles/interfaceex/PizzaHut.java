package interfaceex;

public class PizzaHut implements Zomato {

    String hotelName;
    String location;
    String phoneNo;

    public PizzaHut(String hotelName, String location, String phoneNo) {
        this.hotelName = hotelName;
        this.location = location;
        this.phoneNo = phoneNo;
    }

    @Override
    public void getFoodItem(String restName, String foodName) {
        System.out.println("preparing food item:"+foodName+" in my restaurant:"+restName);

    }

    @Override
    public void giveFoodSpecification(String restName,String foodName, String instruction) {

        System.out.println("please find below instruction to prepare foodItem:"+foodName);
        System.out.println(instruction);
    }

    public String getHotelDetails()
    {
        return "HotelName:"+ this.hotelName+",location:"+this.location+",phoneno:"+this.phoneNo;
    }
}
