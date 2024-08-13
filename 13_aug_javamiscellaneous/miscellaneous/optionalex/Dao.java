package miscellaneous.optionalex;


import layeredexample.model.Order;

import java.util.Optional;

public interface Dao<Order>{
    public Optional<Order> get(int id);
}
