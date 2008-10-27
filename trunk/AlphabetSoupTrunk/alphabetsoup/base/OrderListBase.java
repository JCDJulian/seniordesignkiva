/**
 * 
 */
package alphabetsoup.base;

import alphabetsoup.framework.Order;
import alphabetsoup.framework.SKU;
import java.util.List;
import java.util.ArrayList;


/**
 * @author gth800k
 *
 */
public class OrderListBase {
	
	private List<Order> completeOrder;
	private List<Order> incompleteOrder;
	private List<Order> orders;
	
	public OrderListBase()
	{
		completeOrder = new ArrayList<Order>();
		incompleteOrder = new ArrayList<Order>();
		orders = new ArrayList<Order>();
	}
	
	
}
