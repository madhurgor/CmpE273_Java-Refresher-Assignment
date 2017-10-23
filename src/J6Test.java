import static org.junit.Assert.*;

import org.junit.Test;

public class J6Test {

	@Test
	public void test() {

		Professor p1=new Professor("Simon","Shim","SE","EDT","ss@g.c");
		Student1 s1=new Student1("Madhur","Gor","SE","4","m@g.c");
		
		Gen<Professor> gp=new Gen<Professor>(p1);
		Gen<Student1> gs=new Gen<Student1>(s1);

		assertEquals("First Name: Simon\nLast Name: Shim\nDepartment: SE\nSubject: EDT\nEMail ID: ss@g.c",""+gp.getGen());
		assertEquals("First Name: Madhur\nLast Name: Gor\nDepartment: SE\nGrade: 4\nEMail ID: m@g.c",""+gs.getGen());
		assertNotEquals("First Name: Madhur\nLast Name: Gor\nDepartment: SE\nGrade: 4\nEMail ID: m@g.c",""+gp.getGen());
		assertNotEquals("First Name: Simon\nLast Name: Shim\nDepartment: SE\nSubject: EDT\nEMail ID: ss@g.c",""+gs.getGen());
	}
}
