/**
 * 
 */
package alphabetsoup.base;

import alphabetsoup.framework.Order;
import alphabetsoup.framework.SKU;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;


/**
 * @author gth800k
 *
 */

/*
 * this class is equivalent to WordListBase
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
	
	public void readOrder()
	{
		// READ FROM DATABASE 
		try
    	{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String filename = "officedepot.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database+= filename.trim() + ";DriverID=22;READONLY=true}"; // add on to the end
            Connection con = DriverManager.getConnection( database ,"","");

            Statement s = con.createStatement();
			s.execute("select x_pos,y_pos from Bucket"); // select the data from the table
			ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
			if (rs != null) // if rs == null, then there is no ResultSet to view
			while ( rs.next()) // this will step through our data row-by-row
			{
				System.out.println("x_pos: " + rs.getString(1) + " and y_pos: " + rs.getString(2));
			}
			s.close(); // close the Statement to let the database know we're done with it
			con.close();
		}
        catch (Exception e) 
        {
            System.out.println("Error: " + e);
        }
	}
	public void addOrder()
	{
		
	}
	public void removeOrder()
	{
		
	}
}
