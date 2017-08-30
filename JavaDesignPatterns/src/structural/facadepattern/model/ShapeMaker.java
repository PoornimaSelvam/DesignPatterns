package structural.facadepattern.model;

/**
 * Facade Pattern: hides the complexities of the system and provides an interface to the client 
 * using which the client can access the system.
 * Uses:
 * 1. When we want to provide simple interface to a complex sub-system.
 * 2. It promotes loose coupling between subsystems and its clients.
 * 
 * Implementation:
 * We are going to create a Shape interface and concrete classes implementing the Shape interface. 
 * A facade class ShapeMaker is defined as a next step.
 * 
 * ShapeMaker class uses the concrete classes to delegate user calls to these classes. 
 * FacadePatternDemo, our demo class, will use ShapeMaker class to show the results.
 *
 */
public class ShapeMaker {
	
	private Shape circle;
	private Shape rectangle;
	
	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
	}

	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
}
