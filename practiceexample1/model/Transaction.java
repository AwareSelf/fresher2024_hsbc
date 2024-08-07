package practiceexample1.model;

import java.time.LocalDateTime;

public class Transaction {

    int transId;
    LocalDateTime timestamp;

    public Transaction(int transId, LocalDateTime timestamp) {
        this.transId = transId;
        this.timestamp = timestamp;
    }
}
