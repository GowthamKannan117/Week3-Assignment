package week3.Assignment2;

public class Elements {

	public static void main(String[] args) {

		String input = "Arun";
	Button obj1 = new Button();
	CheckBoxButton obj2 = new CheckBoxButton();
	RadioButton obj3 = new RadioButton();
	TextField obj4 = new TextField();
	
	obj1.click();
	obj1.submit();
	obj2.clickCheckBox();
	obj3.setText(input);
	obj3.selectRadioButton();
	obj4.getText();
	
	}
}
