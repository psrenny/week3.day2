package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindInsertino {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for (Integer integer : arr1) {
			list1.add(integer);
		}
		System.out.println("First Array list : "+list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		for (Integer integer : arr2) {
			list2.add(integer);
		}
		System.out.println("First Array list : "+list2);
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		for(int i=0; i<list1.size();i++)
		{
			boolean status = list2.contains(list1.get(i));
			if(status == true)
			{
				list3.add(list1.get(i));
				
			}
		}
		System.out.println("First array elements matching second array are : "+list3);
	}

}
