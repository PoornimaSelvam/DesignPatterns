package structural.adapterpattern.test;

import structural.adapterpattern.model.Rectangle;
import structural.adapterpattern.model.RectangleAdapter;
import structural.adapterpattern.model.RectangleImpl;
import structural.adapterpattern.model.Square;
import structural.adapterpattern.model.SquareImpl;

public class AdapterTest {
	public static void main(String[] args) {
		Square square = new SquareImpl();
		Rectangle rectangle = new RectangleImpl();
		
		System.out.println(square.calculateArea(10));
		System.out.println(rectangle.calculateArea(10, 10));
		
		// wrap rectangle inside adapter so that it behaves like square
		RectangleAdapter adapter = new RectangleAdapter(rectangle);
		System.out.println(adapter.calculateArea(10));
	}
}
