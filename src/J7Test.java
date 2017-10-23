import static org.junit.Assert.*;

import org.junit.Test;

public class J7Test {

	@Test
	public void test() {
		Quiz q=new Quiz();
		
		Student2 s1=new Student2(1,q);
		Professor1 p1=new Professor1("Simon Shim",q);
		
		assertTrue(s1.t.isAlive());
		assertTrue(p1.t.isAlive());
		
		//assertEquals(true,s1.t.isAlive());
		//assertEquals(true,p1.t.isAlive());
	}
}
