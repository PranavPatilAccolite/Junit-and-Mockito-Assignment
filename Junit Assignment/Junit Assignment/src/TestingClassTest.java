import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingClassTest {
	TestingClass test;
	
	@Before
	public void setup() throws Exception{
		this.test = new TestingClass();
		System.out.println("Before");
	}
	
	@Test
	public void testLeftshift() {
		assertEquals(4,test.leftshift(8));
	}

	@Test
	public void testRightshift() {
		assertEquals(16,test.rightshift(8));
	}

	@Test
	public void testAbsolute() {
		assertEquals(4,test.absolute(-4));
	}

	@Test (expected = ArithmeticException.class)
	public void testFactorial() {
		test.factorial(-10);
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("After");
	}
}
