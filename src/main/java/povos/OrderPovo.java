package povos;

import java.util.List;


import com.xin.entity.Order;
import com.xin.entity.Orderitem;

public class OrderPovo  extends  Order {
	private  List<Orderitem>    orderitems  ;	

	public List<Orderitem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(List<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	/**
	 * 
	 */
	public OrderPovo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orderitems
	 */
	public OrderPovo(List<Orderitem> orderitems) {
		super();
		this.orderitems = orderitems;
	} 
	

}
