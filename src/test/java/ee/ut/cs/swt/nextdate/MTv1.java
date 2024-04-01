package ee.ut.cs.swt.nextdate;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

public class MTv1 {
	
	private NextDate trialDate = new NextDate(3,4,1976);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	/*
	 * Test method for 'ee.ut.cs.swt.nextdate.NextDate.run(int, int, int)'
	 */
	
	@Test
	public final void testJuneToJuly(){
	assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
	}
	
	@Test
	public final void testMarchToApril(){
	assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
	}

	@Test
	public final void testDecemberToJanuary(){ assertEquals("Invalid Next Year", trialDate.run(12, 31, 2021)); }

	@Test
	public final void testLeapYear(){
		assertEquals("2/29/2004", trialDate.run(2, 28, 2004));
	}
}
