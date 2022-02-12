package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> value = new ArrayList<Integer>();
		for (Integer integer : data) {
			value.add(integer);
		}
		System.out.println("Actual values in the list : "+value);
		Collections.sort(value);
		System.out.println("Values in the list after ascending sort : "+value);
		System.out.println("Second largest value in the list is : "+value.get(value.size()-2));
	}
}
