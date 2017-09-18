package product;

import static org.junit.Assert.*;

import org.junit.Test;

public class Main {

	@Test
	public void test() {
		ProductList s=new ProductList();
		ProductList m=new ProductList();
		ProductInfo product1= new ProductInfo();
		product1.name="1号商品";
		product1.price=(float)100;
		s.mProductList.add(product1);
		s.display();
		m.display();
		
	}

}
