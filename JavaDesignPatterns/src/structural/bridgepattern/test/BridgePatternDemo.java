package structural.bridgepattern.test;

import structural.bridgepattern.model.Assemble;
import structural.bridgepattern.model.Bike;
import structural.bridgepattern.model.Car;
import structural.bridgepattern.model.Produce;
import structural.bridgepattern.model.Vehicle;

/**
 * Decouple an abstraction from its implementation so that the two can vary independently.
 *	- Decouple implementation from interface and hiding implementation details from client is the essence of bridge design pattern.
 *
 *  http://javapapers.com/design-patterns/bridge-design-pattern/
 *  
 *  1. Creates two different hierarchies. One for abstraction and another for implementation.
 *  2. We create a bridge that coordinates between abstraction and implementation.
 *  3. Abstraction and implementation can be extended separately.
 *  4. Should be used when we have need to switch implementation at runtime.
 *  5. Client should not be impacted if there is modification in implementation of abstraction.
 *  
 *  Bridge Vs Adapter:
 *  The adapter design pattern helps it two incompatible classes to work together. 
 *  But, bridge design pattern decouples the abstraction and implementation by creating two different hierarchies.
 *  
 *  java.util.Collections#newSetFromMap()
 *  LinkedHashMap(LinkedHashSet<K>, List<V>)
 *
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Vehicle v1 = new Car(new Produce(), new Assemble());
		v1.manufacture();
		Vehicle v2 = new Bike(new Produce(), new Assemble());
		v2.manufacture();
	}
}
