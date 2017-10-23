import static org.junit.Assert.*;

import org.junit.Test;

public class J2Test {

	@Test
	public void test() {
		assertEquals(1,J2.fact(1));
		assertEquals(1,J2.fact(0));
		assertEquals(720,J2.fact(6));
		assertEquals(120,J2.fact(5));
	}
}
