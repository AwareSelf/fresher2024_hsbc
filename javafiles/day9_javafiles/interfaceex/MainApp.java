package interfaceex;

public class MainApp {

    public static void main(String[] args) {

        //we will use same common Zomato interface/service, to place the food order
        //ordering Pizza from PizzaHut.
        Zomato intf = new PizzaHut("MyPizzaHutCorner","Pune, Hadapsar","9920366274");
        intf.getFoodItem("MyPizzaHutCorner","VegMargaritaPizza");
        intf.giveFoodSpecification("MyPizzaHutCorner","VegMargaritaPizza","don't add mushroom");


        ((PizzaHut)intf).getHotelDetails();
        System.out.println(intf.getLatestOffer());

       // intf.getPercentageDiscount(); --gives error as percentageDiscount() is private in an interface

        //for ordering burger from Dominos
        intf = new BurgerHouse("Dominos","Kalyani Nagar");
        intf.getFoodItem("Dominos","McVeggie");

        BurgerHouse ob = new BurgerHouse("McDonalds","Magarpatta");
        meth(ob,"McD","McMaharaja");

       PizzaHut ob1 = new PizzaHut("PizaHutt","Magarpatta","777888");
        meth(ob1,"Pizzahut","FarmhousePizza");


    }

         static void meth(Zomato intf,String restaurantname,String foodname)
          {
              intf.getFoodItem(restaurantname,foodname);
          }
}
