package structural.decoratorpattern.model;

/**
 * Decorator class implements the component interface and it has a HAS-A relationship with the component interface. 
 * The component variable should be accessible to the child decorator classes, 
 * so we will make this variable protected.
 *
 */
public class IcecreamDecorator implements Icecream {
	
	protected Icecream specialIcecream;
	
	public IcecreamDecorator(Icecream specialIcecream){
		this.specialIcecream = specialIcecream;
	}

	@Override
	public String makeIcecream() {
		return specialIcecream.makeIcecream();
	}

}
