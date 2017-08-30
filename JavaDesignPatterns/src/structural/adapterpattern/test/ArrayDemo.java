package structural.adapterpattern.test;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		String a[] = new String[] {"abc", "klm", "xyz"};
		
		List l = Arrays.asList(a);
		
		System.out.println("List : " + l);
	}
}
