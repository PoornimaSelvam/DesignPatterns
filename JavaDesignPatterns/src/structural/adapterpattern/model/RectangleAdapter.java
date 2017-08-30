package structural.adapterpattern.model;

/**
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces 
 * can work together. The object that joins these unrelated interface is called an Adapter.
 * Example:
 * 	We have an interface Square, having method calculateArea(int side) which takes one parameter.
 *	We have another interface Rectangle having method calculateArea(int length, int width) which takes two parameters.
 *	Now a Square can also be considered as a Rectangle due to its geometrical properties. 
	Square should also be able to calculate area using length and width.
 *	In current situation, calculateArea(int) from Square can only take a side and not both length and width
 *	To solve this, we can create an intermediate adapter class which can use functionality of Rectangle.
 *
 *	JDK Examples:
 *  java.util.Arrays#asList()
	java.io.InputStreamReader(InputStream) (returns a Reader)
	java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 */
public class RectangleAdapter implements Square {
	
	private Rectangle rectangle = null;
	
	public RectangleAdapter(Rectangle rectangle){
		this.rectangle = rectangle;
	}

	@Override
	public int calculateArea(int side) {
		return rectangle.calculateArea(side, side);
	}

}
