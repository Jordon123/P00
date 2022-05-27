import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals (expected,actual);
	}
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiple() {
		int a = 2;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected = 4;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivide() {
		int a = 2;
		int b = 2; 
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 1;
		assertEquals(actual, expected);
	}
	@AfterEach
	void tearDown() throws Exception {
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
}
