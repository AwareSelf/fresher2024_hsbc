package layeredexample.businesslayer.busslayerexceptions;

public class OrderSaveException extends Exception{

    public OrderSaveException(String message, Throwable cause) {
        super(message, cause);
    }
}
