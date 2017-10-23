import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class J5Test {

	@Test
	public void test() {

		HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
		h1.put(1,new Student("Madhur","Gor","Software Engineering","4.0","m@g.c"));
		h1.put(2,new Student("Hiren","Gor","Software Engineering","3.77","h@g.c"));

		Set<Integer> s1 = h1.keySet();
		Iterator<Integer> i = s1.iterator();
		int k=(int)i.next();
		assertEquals("First Name: Madhur\nLast Name: Gor\nDepartment: Software Engineering\nGrade: 4.0\nEMail ID: m@g.c",h1.get(k).toString());
		k=(int)i.next();
		assertEquals("First Name: Hiren\nLast Name: Gor\nDepartment: Software Engineering\nGrade: 3.77\nEMail ID: h@g.c",h1.get(k).toString());
	}

}
