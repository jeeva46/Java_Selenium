package Week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 String text1 = "stops";  
	     String text2 = "potss";
	     
	     if(text1.length()!=text2.length()) {
	    	 System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	     }
	     
	   char[] txt1 = text1.toCharArray();
	   char[] txt2 = text2.toCharArray();
	     
	   Arrays.sort(txt1);
	   Arrays.sort(txt2);
	  
	   if(Arrays.equals(txt1, txt2)) {
		   System.out.println("The given strings are Anagram");
	   }
	   else {
		   System.out.println("The given strings are not an Anagram");
	   }
	     

	}

}
