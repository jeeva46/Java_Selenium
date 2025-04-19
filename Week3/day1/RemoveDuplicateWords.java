package Week3.day1;

import java.util.Arrays;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String text = “We learn Java basics as part of java sessions in java week1”
		
		String text = "We learn Java basics as part of java sessions in java week1";
		int count =0;
		
		String[] s = text.split(" ");
		
		for(int i=0;i<s.length;i++) {
			
			for(int j=i+1;j<s.length;j++) {
				
				if(s[i].equalsIgnoreCase(s[j])) {
					s[j]=s[j].replaceAll("[A-Za-z]", " ");
					count++;
				}
				
			}
		}
		
		if(count>0) {
			for(int i=0;i<s.length;i++) {
				System.out.print(s[i] + " ");
			}
		}
		//System.out.println(Arrays.toString(s));
		
		

	}

}
