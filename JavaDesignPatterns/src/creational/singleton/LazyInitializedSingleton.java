package creational.singleton;

/**
 * 
 * @author Poornima
 *
 * Lazy Initialization - Initialize new instance of the class in getInstance() method it self. 
 * This method will check if there is any instance of that class is already created? 
 * If yes, then our method (getInstance()) will return that old instance and 
 * if not then it creates a new instance of the singleton class in JVM and returns that instance. 
 * This approach is called as Lazy initialization.
 */
public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {}
	
	public static LazyInitializedSingleton getInstance(){
		if (instance == null)
		{
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
	
}
