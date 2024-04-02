package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 1801);
	    String string0 = nextDate0.run(10, 10, 1801);
	    assertEquals("10/11/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1970, 1970, 1970);
	    String string0 = nextDate0.run(2, 1970, 1970);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1959, 1959, 1959);
	    String string0 = nextDate0.run(11, 31, 1959);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1965, 1965, 1965);
	    String string0 = nextDate0.run(5, 31, 1965);
	    assertEquals("6/1/1965", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 30, 30);
	    String string0 = nextDate0.run(9, 30, 1991);
	    assertEquals("10/1/1991", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 6);
	    String string0 = nextDate0.run(6, 6, 2019);
	    assertEquals("6/7/2019", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2000, 2000, 2000);
	    String string0 = nextDate0.run(2, 28, 2000);
	    assertEquals("3/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 1089, 1089);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndZero() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, 0, 0);
	    String string0 = nextDate0.run(0, 0, 0);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 1801);
	    assertEquals("3/4/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(3754, 3754, 3754);
	    String string0 = nextDate0.run(2021, 12, 3754);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1970, 1970, 1970);
	    String string0 = nextDate0.run(1, 1, 1970);
	    assertEquals("1/2/1970", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(2004, 2004, 2004);
	    String string0 = nextDate0.run(4, 12, 2004);
	    assertEquals("4/13/2004", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(3718, 3718, 3718);
	    String string0 = nextDate0.run(12, 3718, 3718);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1959, 1959, 1959);
	    String string0 = nextDate0.run(8, 8, 1959);
	    assertEquals("8/9/1959", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(14, 14, 14);
	    String string0 = nextDate0.run(12, 14, 2019);
	    assertEquals("12/15/2019", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(3754, 3754, 3754);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1970, 1970, 1970);
	    String string0 = nextDate0.run(7, 17, 1970);
	    assertEquals("7/17/1970", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(3756, 3756, 3756);
	    String string0 = nextDate0.run(12, 31, 2019);
	    assertEquals("1/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1963, 1963, 1963);
	    String string0 = nextDate0.run(2, 2, 1963);
	    assertEquals("2/3/1963", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1970, 1970, 1970);
	    String string0 = nextDate0.run(2, 29, 1970);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1959, 1959, 1959);
	    String string0 = nextDate0.run(2, 31, 1959);
	    assertEquals("Invalid Input Date", string0);
	}

}