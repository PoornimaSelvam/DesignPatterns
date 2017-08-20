package creational.singleton;

/**
 * @author Poornima
 * 
 * Eager initialization (Static Factory method) - Instance of singleton class is created at the time of class loading. 
 */
public class EagerIntializedSingleton {
	
	private static final EagerIntializedSingleton instance = new EagerIntializedSingleton();
	
	//private constructor
	private EagerIntializedSingleton() {}

	public static EagerIntializedSingleton getInstance() {
		return instance;
	}
	
}
//Drawback:
//Here instance is created even though client application might not be using it. 
//This might be a considerable issue if your singleton class in creating a database connection or creating a socket. 
//This may cause the memory leak problem. The solution is to create the new instance of the class, when needed. 
//This can be achieved by Lazy Initialization method.