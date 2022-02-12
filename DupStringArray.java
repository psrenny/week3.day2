package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DupStringArray {

	public static void main(String[] args) {
		String Paypal = "We learn java basics as part of java sessions in java week1";
		String Pay = Paypal.toLowerCase();
		
		char[] PY=Pay.toCharArray();
		
		Set<Character> dup = new LinkedHashSet<Character>();
		for (Character chr : PY) {
			dup.add(chr);
		}
		System.out.println("String without duplicate : "+dup);
		/*	List<Character> ndup = new ArrayList<Character>();	   
		System.out.println("Actual String : "+dup);
        for(int i = 0; i < dup.size(); i++) 
        {          
                 boolean status = ndup.contains(dup.get(i));
                 if(status==false)
                 {
                	 ndup.add(dup.get(i));
                 }                                
        } 
        System.out.println("String without duplicate : "+ndup);*/

	}

}
