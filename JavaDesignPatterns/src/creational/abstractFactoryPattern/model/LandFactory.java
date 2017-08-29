package creational.abstractFactoryPattern.model;

public class LandFactory implements AnimalAbstractFactory {

	@Override
	public Animal createAnimal() {
		return new Elephant();
	}

}
