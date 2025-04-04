package Week1.day2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		int a=0;
		int b=1;
		int next=a+b;
		System.out.print(a + ",");
		System.out.print(b + ",");
		for(int i=3;i<=num;i++) {
			next =a+b;
			a=b;
			b=next;
			System.out.print(next + ",");
		}
		
		

	}

}
