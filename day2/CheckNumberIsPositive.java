package Week1.day2;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = in.nextInt();
		
		if(a>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}

}
