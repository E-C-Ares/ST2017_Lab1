package isTriangle;

import static org.junit.Assert.*;

import org.junit.Test;


public class MainTest {

	Main t= new Main();
	//getTriangleStatus getStatus = new getTriangleStatus();
	
	@Test
	public void test1() {
		assertEquals("Should be an equilateral triangle", 3, t.getTriangleStatus(1.0, 1.0, 1.0));
	}
	
	@Test
	public void test2() {
		assertEquals("Should be an ERROR!", -1, t.getTriangleStatus(0, 0, 0));
	}
	
	@Test
	public void test3() {
		assertEquals("Should be an ERROR!", -1, t.getTriangleStatus(0, 1, 1));
	}
	
	@Test
	public void test4() {
		assertEquals("Should be an ERROR!", -1, t.getTriangleStatus(-0.01, 9.0, 9.0));
	}
	
	@Test
	public void test5() {
		assertEquals("Should be an isosceles triangle", 2, t.getTriangleStatus(2, 2, 3));
	}
	
	@Test
	public void test6() {
		assertEquals("Should be an isosceles triangle", 0, t.getTriangleStatus(1, 1, 2));
	}
	
	@Test
	public void test7() {
		assertEquals("Should be a scalene triangle", 1, t.getTriangleStatus(10.0000, 10.0001, 10.0002));
	}
	
	@Test
	public void test8() {
		assertEquals("Should be a scalene triangle", 1, t.getTriangleStatus(10.0000, 10.0001, 10.0002));
	}
	
	@Test
	public void test9() {
		assertEquals("Should be a scalene triangle", 1, t.getTriangleStatus(10.0000, 10.0001, 10.0002));
	}
	
	@Test
	public void test10() {
		assertEquals("Should be a scalene triangle", 1, t.getTriangleStatus(10.0000, 10.0001, 10.0002));
	}
	
	@Test
	public void test11() {
		assertEquals("Should be a scalene triangle", 1, t.getTriangleStatus(10.0, 9.0, 8.0));
	}	
}
