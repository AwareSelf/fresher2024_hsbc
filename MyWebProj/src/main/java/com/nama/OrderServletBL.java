package com.nama;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nama.daoimpl.OrderDaoImpl;
import com.nama.model.Order;
import com.namaorderdaointf.OrderDaoIntf;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/orderbl")
public class OrderServletBL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	OrderDaoIntf ordrintf;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServletBL() {
        super();
        
        //use OrderDaoFactory class to get instance of OrderDaoImpl
        
        this.ordrintf = new OrderDaoImpl();
              
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("orderid");
	    int orderid = Integer.parseInt(id);
		System.out.println("orderid ="+orderid);
		
		Order o = this.ordrintf.getOrder(orderid);
		System.out.println(o);
		
	
		
		String orderjson = null;
		
		/*
		 * rightnow, we are manually converting order object to order json string
		   in restservice, you can return order object directly and it will
		   be auto-converted to json string!
		  */
		response.setContentType("application/json");
		orderjson="{\"orderid\":"+o.getOrderId()
		          +",\"ordername\":\""+o.getOrderName()
		          +"\",\"orderprice\":"+o.getOrderPrice()
		          +"}";
		
		 response.getWriter().append(orderjson);
		
		/*
		orderjson = "{\"orderid\":"+ o.getOrderId()+
				      ",\"ordername\":"+o.getOrderName()
				      +",\"orderprice\":"+o.getOrderPrice()+"}";
				 response.getWriter().append(orderjson);
	
	    */
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
