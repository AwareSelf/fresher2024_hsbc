package miscellaneous.optionalex;

import layeredexample.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDao implements Dao<Order> {

    private List<Order> orderList = new ArrayList<>();

    public void preLoadFromDb()
    {
        //load Orders from Order table in db and add Orders to orderList
    }

    @Override
    public Optional<Order> get(int id) {
        return Optional.ofNullable(orderList.get(id));
    }
}