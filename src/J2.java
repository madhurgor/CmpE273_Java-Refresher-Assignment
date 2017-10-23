import java.util.*;

public class J2
{
	public static void main(String []s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter number:");
		int n=sc.nextInt();
		System.out.println("The factorial of "+n+" is "+fact(n));
		sc.close();
	}
	static int fact(int n)
	{
		Stack<Integer> st=new Stack<Integer>();
		int r=1;
		for(int i=n;i>0;i--)
		{
			st.push(i);
			System.out.println("Stack: "+st);
		}
		System.out.println("Now actual multiplication starts.");
		while(!st.empty())
		{
			System.out.println("Stack: "+st);
			r=r*st.pop();
			System.out.println("Buffer Value: "+r);
		}
		return r;
	}
}