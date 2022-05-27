import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorNewTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		CalculatorNew cal = new CalculatorNew();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals (expected,actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		CalculatorNew cal = new CalculatorNew();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiple() {
		int a = 2;
		int b = 2;
		
		CalculatorNew cal = new CalculatorNew();
		int actual = cal.multiple(a, b);
		int expected = 4;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivide() {
		int a = 2;
		int b = 2;
		
		CalculatorNew cal = new CalculatorNew();
		int actual = cal.divide(a, b);
		int expected = 1;
		assertEquals(actual, expected);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


}
