package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Connection_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> c1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer i, Integer j) {
				// TODO Auto-generated method stub
				
				if(i>j)return 1 ;
				else return -1;
				
			}
			
		};
		List<Integer> num = new ArrayList<>();
		num.add(34);
		num.add(343);
		num.add(334);
		num.add(234);
		num.add(31);
		System.out.println(num + " before sorting");

		Collections.sort(num);
		System.out.println(num + " after sorting");
		
		
		

	}

}
