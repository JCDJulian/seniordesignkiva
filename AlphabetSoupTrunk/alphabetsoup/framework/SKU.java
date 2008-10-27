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
	private int remaining;
	
	public SKU(String SKUName, int SKUID, char pickType, int remaining)
	{
		this.SKUName = SKUName;
		this.SKUID = SKUID;
		this.pickType = pickType;
		this.remaining = remaining;
		
	}
	
	public SKU(String SKUName, int remaining)
	{
		this.SKUName = SKUName;
		this.remaining = remaining;
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
	
	private int getRemaining()
	{
		return this.remaining;
	}
}
