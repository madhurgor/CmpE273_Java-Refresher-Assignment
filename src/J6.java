class Professor
{
	String fname,lname,dept,sub,email;
	float grade;
	Professor(String fname, String lname, String dept, String sub, String email)
	{
		this.fname=fname;
		this.lname=lname;
		this.dept=dept;
		this.sub=sub;
		this.email=email;
	}
	public String toString()
	{
		return "First Name: "+fname+"\nLast Name: "+lname+"\nDepartment: "+dept+"\nSubject: "+sub+"\nEMail ID: "+email;
	}
}

class Student1
{
	String fname,lname,dept,email,grade;
	Student1(String fname, String lname, String dept, String grade, String email)
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

class Gen<T>
{
	T t;
	Gen(T t)
	{
		this.t=t;
	}
	T getGen()
	{
		return this.t;
	}
}

public class J6
{
	public static void main(String s[])
	{
		Professor p1=new Professor("Simon","Shim","SE","EDT","ss@g.c");
		Student1 s1=new Student1("Madhur","Gor","SE","4","m@g.c");
		
		Gen<Professor> gp=new Gen<Professor>(p1);
		Gen<Student1> gs=new Gen<Student1>(s1);
		
		System.out.println("Professor's Information:");
		System.out.println(gp.getGen());

		System.out.println();

		System.out.println("Student's Information:");
		System.out.println(gs.getGen());
		
	}
}