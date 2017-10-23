class Quiz
{
	boolean flag=false;
	synchronized void solve(int id)
	{
		while(!flag)
		{
			System.out.println("Student id "+id+" is waiting for professor to generate quiz:");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Studnet id "+id+" is solving the quiz..");
	}
	synchronized void generate(String pname)
	{
		System.out.println("Professor "+pname+" generated an assignment..");
		flag=true;
		notifyAll();
	}
}

class Student2 implements Runnable
{
	Thread t;
	int sid;
	Quiz q;
	Student2(int sid, Quiz q)
	{
		this.q=q;
		this.sid=sid;
		t=new Thread(this,"Student");
		t.start();
	}
	public void run()
	{
		q.solve(sid);
	}
}

class Professor1 implements Runnable
{
	Thread t;
	String pname;
	Quiz q;
	Professor1(String pname, Quiz q)
	{
		this.q=q;
		this.pname=pname;
		t=new Thread(this,"Professor");
		t.start();
	}
	public void run()
	{
		q.generate(pname);
	}
}

public class J7
{
	public static void main(String []s)
	{
		Quiz q=new Quiz();
		System.out.println("There are 6 students in the class and the professor is going to start the quiz in some time..\n");
		new Student2(1,q);
		new Student2(2,q);
		new Professor1("Simon Shim",q);
		new Student2(3,q);
		new Student2(4,q);
		new Student2(5,q);
		new Student2(6,q);
	}
}