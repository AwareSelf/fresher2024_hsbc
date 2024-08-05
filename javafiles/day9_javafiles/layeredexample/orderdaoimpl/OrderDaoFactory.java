package layeredexample.orderdaoimpl;

import layeredexample.orderdaointf.OrderDaoIntf;

public class OrderDaoFactory {

  public static OrderDaoIntf getOrderDaoImpl(String impltype)
    {
        if(impltype.equalsIgnoreCase("array"))
        {
            return new OrderDAOArrays();
        }
        else if(impltype.equalsIgnoreCase("list"))
        {
           return new OrderDAOList();
        }
        else
        {
            //default dao implementation to be returned
            return new OrderDAOArrays();
        }



    }


}
