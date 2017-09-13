package behavioral.templateMethodPattern.test;

import behavioral.templateMethodPattern.model.GlassHouse;
import behavioral.templateMethodPattern.model.HouseTemplate;
import behavioral.templateMethodPattern.model.WoodenHouse;

/**
 * Template method pattern -  define an algorithm as skeleton of operations and leave the details to be implemented by the child classes. 
 * The overall structure and sequence of the algorithm is preserved by the parent class.
 * This helps to avoid code duplication.
 * 
 * 1. Template method should consists of certain steps whose order is fixed and for some of the methods, 
 * implementation differs from base class to subclass. Template method should be final.
 * 2. Most of the times, subclasses calls methods from super class but in template pattern, 
 * superclass template method calls methods from subclasses, this is known as Hollywood Principle – “don’t call us, we’ll call you.”.
 *	
 * java.io.InputStream
 * javax.servlet.http.HttpServlet
 */
public class HousingClient {
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		
		houseType.buildHouse();
		System.out.println("************");
		
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}
}
