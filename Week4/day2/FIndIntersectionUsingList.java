package Week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndIntersectionUsingList {

	public static void main(String[] args) {
		
		
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(list.contains(arr2[i])) {
				System.out.print(arr2[i] + " ");
			}
			
		}
		

	}

}
