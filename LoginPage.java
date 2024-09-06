package week3.Assignment1;

public class LoginPage extends BasePage {

	public void performcommonTask() {
		
		System.out.println("Kindly Perform the task");


	}
	
	
	public static void main(String[] args) {

		BasePage obj1=new BasePage();
		
		obj1.findElement();
		obj1.clickElement();
		obj1.enterText();
		obj1.performcommonTask();
		
		LoginPage obj= new LoginPage();
		obj.findElement();
		obj.clickElement();
		obj.enterText();
		obj.performcommonTask();
		
		
		
	}

}
