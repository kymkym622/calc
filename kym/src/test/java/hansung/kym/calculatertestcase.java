package hansung.kym;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class calculatertestcase{
	
	@Test
	public void testadd(){
		calculater cal = new calculater();
		cal.add(2,3);
		assertEquals(5,cal.getResult());
	}
	@Test
	public void testsub(){
		calculater cal = new calculater();
		cal.sub(5,3);
		assertEquals(2,cal.getResult());
	}
	

}
