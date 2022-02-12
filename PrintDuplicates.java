package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] data = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> dup = new LinkedHashSet<Integer>();
		Set<Integer> dupValue = new LinkedHashSet<Integer>();
		for (Integer value : data) {
			boolean status = dup.add(value);
			if(status == false)
			{
				dupValue.add(value);
			}
		}
      System.out.println("Duplicate values in the list are : "+dupValue);
	}

}
