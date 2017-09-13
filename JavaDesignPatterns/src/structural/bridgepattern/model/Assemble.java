package structural.bridgepattern.model;

public class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.println("Assembled");
	}

}
