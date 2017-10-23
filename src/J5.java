import java.util.*;

class Student
{
	String fname,lname,dept,email,grade;
	Student(String fname, String lname, String dept, String grade, String email)
	{
		this.fname=fname;
		this.lname=lname;
		this.dept=dept;
		this.grade=grade;
		this.email=email;
	}
	public String toString()
	{
		return "First Name: "+fname+"\nLast Name: "+lname+"\nDepartment: "+dept+"\nGrade: "+grade+"\nEMail ID: "+email;
	}
}

public class J5
{
	public static void main(String s[])
	{
		HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
		
		h1.put(1,new Student("Madhur","Gor","Software Engineering","4","m@g.c"));
		h1.put(2,new Student("Hiren","Gor","Software Engineering","3.95","h@g.c"));
		h1.put(3,new Student("Madhur","Patel","Software Engineering","3.54","m@p.c"));
		h1.put(4,new Student("Anurag","Juhu","Software Engineering","3.8","a@j.c"));
		h1.put(5,new Student("Smit","Sharma","Software Engineering","4","s@s.c"));
		h1.put(6,new Student("Nabil","Patel","Software Engineering","3.01","n@p.c"));
		
		Set<Map.Entry<Integer, Student>> s1 = h1.entrySet();
		
		for(Map.Entry<Integer, Student> me : s1)
		{
			System.out.println(me.getKey()+":\n"+me.getValue()+"\n");
		}
	}
}