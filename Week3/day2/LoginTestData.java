package Week3.day2;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("Enter the username");
	}
	
	public void enetrPassword() {
		System.out.println("Enter the password");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTestData login = new LoginTestData();
		login.enterUsername();
		login.enetrPassword();
		login.enterCredentials();
		login.navigateToHomePage();

	}

}
