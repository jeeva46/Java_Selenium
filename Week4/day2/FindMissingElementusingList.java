package Week4.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 10, 6, 8};

		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		//1,2,3,4,6,8,10
		for(int i=0;i<list.size();i++) {
			if(list.get(i) != i+1) {
				System.out.print(i+1 + " ");
			}
			
		}
		
	}

}
