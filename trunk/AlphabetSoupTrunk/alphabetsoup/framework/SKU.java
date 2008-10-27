/**
 * 
 */
package alphabetsoup.framework;

/**
 * @author Sovandy
 *
 */

/**
 * this class is equivalent to letter class. It's the item that
 */
public class SKU {
	private String SKUName;
	private int SKUID;
	private char pickType;
	
	public SKU(String SKUName, int SKUID, char pickType)
	{
		this.SKUName = SKUName;
		this.SKUID = SKUID;
		this.pickType = pickType;
	}
	
	public SKU(String SKUName)
	{
		this.SKUName = SKUName;
	}
	
	public String getItemName()
	{
		return SKUName;
	}
	
	public int getSKUID()
	{
		return SKUID;
	}
	
	public char getPickType()
	{
		return pickType;
	}
	
}
