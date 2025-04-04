package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 121;
		int output = 121;
		int result=0;
		for(int i=a;i>0;) {
			int rem = i%10;
			i=i/10;
			result=result*10+rem;
		}
		if(result==output) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is Non-Palindrome");
		}
	}

}
