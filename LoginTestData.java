package week3.Assignment2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter the UserName");

	}
	
	public void enterPassword() {
		
		System.out.println("Enter the Password");
		

	}
	
	public static void main(String[] args) {
		
		LoginTestData obj= new LoginTestData();
		TestData obj1= new TestData();
		
		obj.enterUsername();
		obj.enterPassword();
		obj1.enterCredentials();
		obj1.navigateToHomePage();
	
	}
	

}
