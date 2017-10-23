import java.util.*;

class Person
{
	String name;
	public int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	int age()
	{
		return age;
	}
	String info()
	{
		return this.name+" "+this.age;
	}
}

public class J1
{
	static void get(Queue<Person> main, Queue<Person> below18, Queue<Person> above60, Queue<Person> rest)
	{
		if(main.peek()!=null)
		{
			while(main.peek()!=null)
			{
				Person p=main.poll();
				if(p.age()<18)
				{
					below18.offer(p);
				}
				else if(p.age()>60)
				{
					above60.offer(p);
				}
				else
				{
					rest.offer(p);
				}
			}
		}
		else
		{
			System.out.println("Main Queue is Empty.");
		}
	}
	
	public static void main(String []s)
	{
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
	
		get(main,below18,above60,rest);
		
		System.out.println("Below 18 Queue:");
		if(below18.peek()!=null)
		{
			while(below18.peek()!=null)
			{
				Person p=below18.poll();
				System.out.println(p.info());
			}
		}
		else
		{
			System.out.println("Below 18 Queue is Empty.");
		}

		System.out.println("\nAbove 60 Queue:");
		if(above60.peek()!=null)
		{
			while(above60.peek()!=null)
			{
				Person p=above60.poll();
				System.out.println(p.info());
			}
		}
		else
		{
			System.out.println("Above 60 Queue is Empty.");
		}

		System.out.println("\nRest all persons' Queue:");
		if(rest.peek()!=null)
		{
			while(rest.peek()!=null)
			{
				Person p=rest.poll();
				System.out.println(p.info());
			}
		}
		else
		{
			System.out.println("No person in above 17 and below 61 queue.");
		}
	}
}
