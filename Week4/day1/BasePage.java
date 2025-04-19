package Week4.day1;

public class BasePage {
	
	public void findElement() {
		System.out.println("This method is to find the element");
	}
	
	public void clickElemnt() {
		System.out.println("This method is to click the element");
	}
	
	public void enterText() {
		System.out.println("This method is to enter the text");
	}
	
	public void performCommonTask() {
		System.out.println("performing common task");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePage page = new BasePage();
		page.findElement();
		page.clickElemnt();
		page.enterText();
		page.performCommonTask();
	}

}
