package creational.abstractFactoryPattern.model;

/**
 * Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products.
 *
 */
public class AnimalFactory {
	
	public AnimalFactory(AnimalAbstractFactory factory){
		Animal animal = factory.createAnimal();
		animal.breathe();
	}
}
