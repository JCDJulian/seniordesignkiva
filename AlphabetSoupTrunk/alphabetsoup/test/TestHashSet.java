package alphabetsoup.test;

import java.util.HashSet;
import java.util.Iterator;
import alphabetsoup.framework.SKU;

public class TestHashSet {

	public TestHashSet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<SKU> testset = new HashSet<SKU>();
		SKU sku1 = new SKU("pen", 1, 'A', 10);
		SKU sku2 = new SKU("pencil", 2, 'B', 10);
		SKU sku3 = new SKU("paper", 3, 'C', 10);
		testset.add(sku1);
		testset.add(sku2);
		testset.add(sku3);
		Iterator iterator = testset.iterator(); 
		while(iterator.hasNext())
		{
			SKU sku = (SKU)iterator.next();
			System.out.println("SKU Name is " + sku.getItemName());
		}
	}

}
