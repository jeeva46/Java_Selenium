package Week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "changeme";
		
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			
			if(i%2!=0) {
				//char a = charArray[i];
				
			charArray[i] = Character.toUpperCase(charArray[i]);
			
			
			}
			
		}
		System.out.println(Arrays.toString(charArray));
	}

}
