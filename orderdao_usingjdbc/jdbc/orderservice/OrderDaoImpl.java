package jdbc.orderservice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDaoIntf {

    public OrderDaoImpl() throws SQLException
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    Connection getConnection() throws SQLException
    {
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb1?useSSL=false","root","namrata");

            System.out.println("The connection is successful.");
            return con;
    }


    @Override
    public void addOrder(Order o) throws SQLException {

        /*
            String ins = "insert into myorder values("+o.getOrderId()+",'"+
                    o.getOrderName()+"',"+o.getOrderPrice()+")";
              System.out.println(ins);

              try(Connection con = this.getConnection())
              {
                  if (con != null) {
                      System.out.println("inside add order,connection is successful");
                      Statement s = con.createStatement();
                      int ct = s.executeUpdate(ins);
                      System.out.println("no of order added:" + ct);
                  } else
                      System.out.println("inside add order, conn not successful");
              }//end of try block

         */

        String ins = "insert into myorder values(?,?,?)";
        System.out.println(ins);

        try(Connection con = this.getConnection())
        {
            if (con != null) {
                System.out.println("inside add order,connection is successful");

                PreparedStatement ps = con.prepareStatement(ins);
                ps.setInt(1,o.getOrderId());
                ps.setString(2,o.getOrderName());
                ps.setInt(3,o.getOrderPrice());

                int ct = ps.executeUpdate();

                System.out.println("no of order added:" + ct);
            } else
                System.out.println("inside add order, conn not successful");
        }//end of try block
     }//end of add order method




    @Override
    public Order getOrder(int orderId) throws SQLException{
        String q = "select * from myorder where orderid=?";
        System.out.println(q);
        try(Connection con = this.getConnection())
        {
            if (con != null) {
                System.out.println("inside get order,connection is successful");
                PreparedStatement ps = con.prepareStatement(q);
                ps.setInt(1,orderId);
                ResultSet rs = ps.executeQuery();

                Order o = new Order();
                while(rs.next())
                {
                    o.setOrderId(rs.getInt(1));
                    o.setOrderName(rs.getString(2));
                    o.setOrderPrice(rs.getInt(3));
                    System.out.println(o);
                    return o;
                }
            } else
                System.out.println("inside get order by id, conn not successful");
        }//end of try block
       return null;
    }

    @Override
    public List<Order> getAllOrders() throws SQLException {
        String q = "select * from myorder";
        System.out.println(q);
        try(Connection con = this.getConnection())
        {
            if (con != null) {
                System.out.println("inside get order,connection is successful");
                Statement s = con.createStatement();

                ResultSet rs = s.executeQuery(q);

                List<Order> lst = new ArrayList<Order>();
                while(rs.next())
                {
                    Order o = new Order();
                    o.setOrderId(rs.getInt(1));
                    o.setOrderName(rs.getString(2));
                    o.setOrderPrice(rs.getInt(3));
                    System.out.println(o);
                    lst.add(o);
                }
                return lst;
            } else
                System.out.println("inside get all orders, conn not successful");
        }//end of try block
        return null;
    }
}
