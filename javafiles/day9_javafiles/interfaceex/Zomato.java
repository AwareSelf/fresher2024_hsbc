package interfaceex;

public interface Zomato {

    public abstract void getFoodItem(String restName,String foodName);
    public abstract void giveFoodSpecification(String restName,String foodName,String instruction);


    default String getLatestOffer()
    {
        return "discount on all orders upto:"+this.getPercentageDiscount();
    }

    private double getPercentageDiscount()
    {
        //based on diff type of customer like premium or normal customer
        //it can return diff discounts;
        return 10;
    }
}

