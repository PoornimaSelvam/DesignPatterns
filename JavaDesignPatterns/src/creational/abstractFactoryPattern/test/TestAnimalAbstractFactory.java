package creational.abstractFactoryPattern.test;

import creational.abstractFactoryPattern.model.AnimalAbstractFactory;
import creational.abstractFactoryPattern.model.AnimalFactory;
import creational.abstractFactoryPattern.model.LandFactory;
import creational.abstractFactoryPattern.model.SeaFactory;

/**
 * Examples:
 * javax.xml.parsers.DocumentBuilderFactory#newInstance()
   javax.xml.transform.TransformerFactory#newInstance()
   javax.xml.xpath.XPathFactory#newInstance()
 *
 */
public class TestAnimalAbstractFactory {
	
	public static void main(String[] args) {
		new AnimalFactory(testAbstractFactory("water"));
	}

	private static AnimalAbstractFactory testAbstractFactory(String type) {
		
		if("water".equalsIgnoreCase(type)){
			return new SeaFactory();
		} else {
			return new LandFactory();
		}
		
	}
		
}
