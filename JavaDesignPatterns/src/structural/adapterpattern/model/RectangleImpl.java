package structural.adapterpattern.model;

public class RectangleImpl implements Rectangle {

	@Override
	public int calculateArea(int length, int width) {
		System.out.println("Rectangle...");
		return length * width;
	}

}
