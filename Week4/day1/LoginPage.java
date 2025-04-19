package Week4.day1;

public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTask() {
		
		System.out.println("Override method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage page = new LoginPage();
		page.performCommonTask();
		
				

	}

}
