package Week4.day1;

public class Amazon extends CanaraBank{
	public void cashOnDelivery() {
		
		System.out.println("CashOnDelivery");
		
	}
	public void upiPayments() {
		
		System.out.println("upiPayments");
	}
	public void cardPayments() {
		
		System.out.println("cardPayments");
	}
	public void internetBanking() {
		
		System.out.println("internetBanking");
	}
	public void recordPaymentDetails() {
		
		System.out.println("recordPaymentDetails");
	}
	public static void main(String[] args) {
		Amazon option = new Amazon();
		option.cardPayments();
		option.cashOnDelivery();
		option.upiPayments();
		option.internetBanking();
		option.recordPaymentDetails();
	}
}
