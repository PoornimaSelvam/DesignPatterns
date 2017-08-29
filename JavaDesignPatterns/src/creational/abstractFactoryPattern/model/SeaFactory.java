package creational.abstractFactoryPattern.model;

public class SeaFactory implements AnimalAbstractFactory {

	@Override
	public Animal createAnimal() {
		return new Shark();
	}

}
