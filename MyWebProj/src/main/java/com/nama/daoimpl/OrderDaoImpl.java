package com.nama.daoimpl;

import java.util.*;

import com.nama.model.Order;
import com.namaorderdaointf.OrderDaoIntf;

public class OrderDaoImpl implements OrderDaoIntf{
	
	List<Order> lst;
	
	
	public OrderDaoImpl() {
	     this.lst = new ArrayList<>();
	     Order o1 = new Order(1,"Pen",100);
	     Order o2 = new Order(2,"book",200);
	     
	     this.lst.add(o1);
	     this.lst.add(o2);
	}




	@Override
	public Order getOrder(int orderid) {
		
		for(Order o:this.lst)
		{
			if(o.getOrderId()==orderid)
			{
				return o;
			}
		}
		return null;
	}

}
