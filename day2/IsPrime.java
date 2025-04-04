package Week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		int prime=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime++;
				break;
			}
		}
		if(prime>0) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime Number");
		}

	}

}
