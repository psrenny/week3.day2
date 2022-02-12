package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollectino {

	public static void main(String[] args) {
		List<String> comp = new ArrayList<String>();
		comp.add("HCL");
		comp.add("Wipro");
		comp.add("Aspire Systems");
		comp.add("CTS");
		System.out.println("Actual list order: "+comp);
		System.out.println("Sixe of List is "+comp.size());
		Collections.sort(comp);
		System.out.println("Sorted list order: "+comp);
		Collections.reverse(comp);
		System.out.println("Reversed list order: "+comp);
	}

}
