package practiceexample1.model;

import java.time.LocalDateTime;

public class AtmTransaction extends Transaction{


    public AtmTransaction(int transId, LocalDateTime timestamp) {
        super(transId, timestamp);
    }
}
