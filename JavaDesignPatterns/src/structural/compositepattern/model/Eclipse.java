package structural.compositepattern.model;

public class Eclipse implements Application{

	@Override
	public void close() {
		System.out.println("Closing Eclipse...");
	}

}
