package structural.compositepattern.model;

public class Game implements Application {

	@Override
	public void close() {
		System.out.println("Closing Game..");
	}

}
