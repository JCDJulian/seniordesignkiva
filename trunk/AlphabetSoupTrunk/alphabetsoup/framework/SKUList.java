/**
 * 
 */
package alphabetsoup.framework;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;

/**
 * @author sovandy
 *
 */

/**
 * read SKU info from the database and store in the list
 */
public class SKUList {

	private List<SKU> skuList;
	
	public SKUList()
	{
		skuList = new ArrayList<SKU>();
		try
    	{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String filename = "officedepot.mdb";
            String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            database+= filename.trim() + ";DriverID=22;READONLY=true}"; // add on to the end
            Connection con = DriverManager.getConnection( database ,"","");

            Statement s = con.createStatement();
			s.execute("select sku_name, remainings from SKU"); // select the data from the table
			ResultSet rs = s.getResultSet(); // get any ResultSet that came from our query
			if (rs != null) 
			while ( rs.next()) 
			{
				SKU sku = new SKU(rs.getString(1), rs.getInt(2));
				skuList.add(sku);
			}
			s.close(); // close the Statement to let the database know we're done with it
			con.close();
		}
        catch (Exception e) 
        {
            System.out.println("Error: " + e);
        }
	}
}
