package mavenforjunit.junitmavenproject1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOdd {

	java.lang.String ans="";
	public void EvenOdd(int num)
	{
		if(num%2==0) 
			ans="even";
		else
			ans="odd";
	}
	@Test
	public void EvenOrOddTest() {
		EvenOdd(9);
		System.out.println(ans);
		assertEquals("odd", ans);
	}
	
}
