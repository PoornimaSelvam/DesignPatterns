package creational.abstractFactoryPattern.model;

public class AnimalFactory {
	
	public AnimalFactory(AnimalAbstractFactory factory){
		Animal animal = factory.createAnimal();
		animal.breathe();
	}
}
