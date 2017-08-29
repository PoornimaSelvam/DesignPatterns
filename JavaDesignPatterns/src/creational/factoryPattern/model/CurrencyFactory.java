package creational.factoryPattern.model;

/**
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
 * we need to return one of the sub-class. 
 * This pattern take out the responsibility of instantiation of a class from client program to the factory class.
 * Creating objects without specifying the exact class of the object that will be created. 
 * Factory pattern provides abstraction between implementation and client classes through inheritance.
 *
 * Examples:
 * java.util.Calendar, NumberFormat getInstance()
 * valueOf() method in wrapper classes like Boolean, Integer etc.
 */
public class CurrencyFactory {

	public Currency getCurrencyByCountry(String countryCode) {
		Currency curr = null;
		
		//based on the logic factory instantiates an object
		if ("IN".equalsIgnoreCase(countryCode)) {
			curr = new India();
		} else if ("USA".equalsIgnoreCase(countryCode)) {
			curr = new USA();
		}
		return curr;
	}
}
