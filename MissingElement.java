package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,7,6,8};
		List<Integer> value = new ArrayList<Integer>();
		for (Integer integer : data) {
			value.add(integer);
		}
		System.out.println("Actual values in the list : "+value);
		Collections.sort(value);
		System.out.println("Values in the list after ascending sort : "+value);
		List<Integer> value2 = new ArrayList<Integer>();
		for(int i=1; i<value.size();i++)
		{
			boolean status = value.contains(i);
			if(status == false)
			{
				value2.add(i);
			}
		}
		System.out.println("Missing values in the list are : "+value2);
	}

}
