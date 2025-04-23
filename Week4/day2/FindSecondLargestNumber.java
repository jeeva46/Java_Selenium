package Week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 2, 11, 4, 6, 7};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		int length = list.size();
		
		System.out.println(list.get(length-2));
		

	}

}
