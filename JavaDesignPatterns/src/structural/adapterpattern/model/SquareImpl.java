package structural.adapterpattern.model;

public class SquareImpl implements Square {

	@Override
	public int calculateArea(int side) {
		System.out.println("Square...");
		return (int) Math.pow(side, 2);
	}

}
