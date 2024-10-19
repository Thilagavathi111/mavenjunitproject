package mavenforjunit.junitmavenproject1;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class String {
		
	java.lang.String s1="hello";
	java.lang.String s2="hello";
	@Test
	public void stringMatch() {
		
		assertSame(s2, s1);
	}
}