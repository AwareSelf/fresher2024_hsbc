package practiceexample1.model;

import java.time.LocalDateTime;

public class OnlineTransaction extends Transaction
{
    int limit;
    public OnlineTransaction(int transId, LocalDateTime timestamp,int limit) {
        super(transId, timestamp);
        this.limit = limit;
    }
}
