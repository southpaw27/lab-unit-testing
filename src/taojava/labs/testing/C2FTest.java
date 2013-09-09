package taojava.labs.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class C2FTest {

	@Test
	public void testC2f() {
		assertEquals(0,0);
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		assertEquals("Stupid Test", 15, 3*5);
        //fail("Not yet implemented");
    } // test2()
	@Test
	public void test3() {
		assertEquals("0 C = 32 F", 32, SampleMethods.c2f(0));
	} // test3
	@Test
	public void test4() {
		assertEquals("100 C = 212 F", 212, SampleMethods.c2f(100));
	} // test4
	@Test
	public void test5() {
		assertEquals("10 C = 40 F", 50, SampleMethods.c2f(10));
	} // test5
	@Test
	public void test6() {
		int[] values = {1, 2, 3};
		assertEquals("sum(1, 2, 3) = 6", 6, SampleMethods.sum(values));
	} // test6
	@Test
	public void test7() {
		int[] values = {2, 3, 5};
		assertEquals("sum(values) = 10", 10, SampleMethods.sum(values));
	} // test7
	@Test
	public void testExtremes() {
        int tmp = Integer.MAX_VALUE - 10;
        int[] values = { tmp, tmp, -tmp, -tmp };
        assertEquals("extreme test", 0, SampleMethods.sum(values));
    } // testExtremes
}
