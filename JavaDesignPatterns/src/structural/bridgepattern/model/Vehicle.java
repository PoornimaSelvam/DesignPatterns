package structural.bridgepattern.model;

/**
 *
 * Abstraction in bridge pattern
 */
public abstract class Vehicle {
	//Composition - implementor
	protected Workshop workshop1, workshop2;
	
	public Vehicle(Workshop workshop1, Workshop workshop2){
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	abstract public void manufacture();
}
