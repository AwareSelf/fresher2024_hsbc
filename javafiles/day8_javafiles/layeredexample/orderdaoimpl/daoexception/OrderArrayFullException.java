package layeredexample.orderdaoimpl.daoexception;

public class OrderArrayFullException extends Exception{

    public OrderArrayFullException(int arrlength) {
        super("order array is full with arraylength:"+arrlength+"so can't add new order..");
    }

}
