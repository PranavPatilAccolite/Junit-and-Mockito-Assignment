import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ShopTest {
	Shop shop;
	Customer customer;
	TimeHelper timehelper;
	
	@Before
	public void setUp() throws Exception {
		shop = new Shop();
		customer = Mockito.mock(Customer.class);
		timehelper = Mockito.mock(TimeHelper.class);		
	}
	
	@Test
	public void testOpenShop() {
		//Act
		boolean shopStatus = shop.OpenShop(timehelper, customer);
		
		//Assert
		assertEquals(true,shopStatus);
	}

	@After
	public void tearDown() throws Exception {
	}	
}
