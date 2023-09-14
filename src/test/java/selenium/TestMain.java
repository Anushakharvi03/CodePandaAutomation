package selenium;

//imported object from another package
import test.LoginPage;

public class TestMain {
	public static void main (String args[]) {
		automationTest(); //static method
		
		TestMain obj = new TestMain();
		obj.automationObject();
		
		
		//calling the object from the another package
		LoginPage obj1 = new LoginPage();
		obj1.loginObject();
		
	}

	//No need to create the object for static
 static void automationTest() {
	System.out.println("Automation");
}
 //object
public void automationObject() {
	System.out.println("ObjectHere");
}
}
