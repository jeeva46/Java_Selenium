package Week2.day1;

public class Browser {

	public String launchBrowser(String browserName) {
		System.out.println(browserName);
		return browserName;	
	}
	public void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		Browser chrome = new Browser();
		chrome.launchBrowser("chrome browser launched successfully");
		chrome.loadUrl();
	}

}
