package Week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		
		Collections.sort(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i) + ",");
		}
		
	}

}
