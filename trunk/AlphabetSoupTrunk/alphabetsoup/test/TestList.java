package alphabetsoup.test;

import java.util.List;
import java.util.ArrayList;
import alphabetsoup.framework.SKU;

public class TestList {

	public TestList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SKU> testlist = new ArrayList<SKU>();
		
		SKU sku1 = new SKU("pen", 1, 'A', 10);
		SKU sku2 = new SKU("pencil", 2, 'B', 10);
		SKU sku3 = new SKU("paper", 3, 'C', 10);
		testlist.add(sku1);
		testlist.add(sku2);
		testlist.add(sku3);
		sku1 = (SKU)testlist.get(0);
		sku2 = (SKU)testlist.get(1);
		sku3 = (SKU)testlist.get(2);
	}

}
