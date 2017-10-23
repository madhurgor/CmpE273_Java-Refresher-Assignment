interface Drivable
{
	String wayOfDriving(String a);
}

abstract class Vehicle
{
	abstract String drive(String a);
}

class MotorCar extends Vehicle implements Drivable
{
	String model(String a)
	{
		return "Model of car is "+a+".";
	}
	String drive(String a)
	{
		return "This runs "+a+".";
	}
	public String wayOfDriving(String a)
	{
		return "This is "+a+" car.";
	}
}

class Aerial extends Vehicle implements Drivable
{
	String model(String a)
	{
		return "Model is "+a+".";
	}
	String drive(String a)
	{
		return "This runs "+a+".";
	}
	public String wayOfDriving(String a)
	{
		return "This is "+a+" handled";
	}
}

public class J4
{
	public static void main(String s[])
	{
		MotorCar m1=new MotorCar();
		System.out.println("Motor Car:");
		System.out.println(m1.model("Renault Duster"));
		System.out.println(m1.drive("On Road"));
		System.out.println(m1.wayOfDriving("AutoDrive"));
		
		System.out.println();
		
		Aerial a1=new Aerial();
		System.out.println("Aeroplane:");
		System.out.println(a1.model("Boing 270"));
		System.out.println(a1.drive("In Sky"));
		System.out.println(a1.wayOfDriving("Remotely"));
	}
}