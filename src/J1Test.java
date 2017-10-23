import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

public class J1Test {

	@Test
	public void test() {
		Queue<Person> main = new LinkedList<>();
		Queue<Person> below18 = new LinkedList<>();
		Queue<Person> above60 = new LinkedList<>();
		Queue<Person> rest = new LinkedList<>();
		
		main.add(new Person("Madhur",17));
		main.add(new Person("Anurag",22));
		main.add(new Person("Rohan",68));
		main.add(new Person("Madhury",16));
		main.add(new Person("Anu",22));
		main.add(new Person("Roh",63));
		main.add(new Person("Hiren",12));
		main.add(new Person("Nabil",28));
		main.add(new Person("Smit",58));
		main.add(new Person("Radha",7));
		main.add(new Person("Niyati",25));
		main.add(new Person("Akash",48));
	
		J1.get(main,below18,above60,rest);

		assertEquals("Madhur 17",below18.peek().info());
		assertEquals("Rohan 68",above60.peek().info());
		assertEquals("Anurag 22",rest.peek().info());
		assertNotEquals("Madhur 17",above60.peek().info());
		assertNotEquals("Madhur 17",rest.peek().info());
		assertNotEquals("Nabil 28",below18.peek().info());
	}
}