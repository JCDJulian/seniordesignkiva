/**
 * 
 */
package alphabetsoup.framework;

import java.util.HashSet;

/**
 * @author sovandy
 * 
 */

/**
 * this class is equivalent to word class
 */
public class Order {
	
	private HashSet<SKU> orders;
	private int orderID;
	
	public Order(int orderID)
	{
		this.orderID = orderID;
		orders = new HashSet<SKU>();
	}
	
	public void addSKU(SKU item)
	{
		this.orders.add(item);
	}
	
	public boolean removeSKU(SKU item)
	{
		return orders.remove(item);
	}
	
	public int getOrderID()
	{
		return this.orderID;
	}
}
