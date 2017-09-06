package structural.adapterpattern.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class ArrayDemo {
	public static void main(String[] args) {
		String a[] = new String[] {"abc", "klm", "xyz"};
		
		
		List<String> l = Arrays.asList(a);
		
		
		System.out.println("List : " + l);
		
		//l.remove(0); -- will throw unsupported exception
		// Arrays are of fixed size - The list is still backed by the array. 
				// Arrays are a fixed size - they don't support adding or removing elements
				// wrap inside an arraylist the arrays.aslist
				//List newlist = new ArrayList(Arrays.asList(la));
		List<String> newList = new ArrayList<String>(l);
		newList.remove(0);
		System.out.println("List after remove: " + newList);
		
		String b="abcklbdfd";
		String[] n = b.split("b");
		for(String c : n)
		System.out.println(c);
	}
}
