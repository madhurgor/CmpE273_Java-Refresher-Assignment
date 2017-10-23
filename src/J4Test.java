import static org.junit.Assert.*;

import org.junit.Test;

public class J4Test {

	@Test
	public void test() {
		MotorCar m1=new MotorCar();
		Aerial a1=new Aerial();
		
		assertEquals("Model of car is Renault Duster.",m1.model("Renault Duster"));
		assertEquals("This runs On Road.",m1.drive("On Road"));
		assertEquals("This is AutoDrive car.",m1.wayOfDriving("AutoDrive"));
		
		assertEquals("Model is Boing 270.",a1.model("Boing 270"));
		assertEquals("This runs In Sky.",a1.drive("In Sky"));
		assertEquals("This is Remotely handled",a1.wayOfDriving("Remotely"));
	}
}
