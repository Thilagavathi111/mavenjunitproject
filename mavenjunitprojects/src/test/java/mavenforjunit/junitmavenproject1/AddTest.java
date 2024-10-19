package mavenforjunit.junitmavenproject1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTest {
	
	public static int add(int a, int b) {
		return (a+b);
}
	@Test
	public void testAdd() {
		assertEquals(8, add(6,2));
	}
}