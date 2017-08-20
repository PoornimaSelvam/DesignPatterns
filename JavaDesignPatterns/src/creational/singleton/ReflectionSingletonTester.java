package creational.singleton;

import java.lang.reflect.Constructor;

/**
 * 
 * @author Poornima
 * 
 * By reflection we can create more than one instance.  
 * Java Reflection is a process of examining or modifying the run-time behavior of a class at run time.
 * 
 * We can make the new instance of the singleton class by changing the constructor visibility 
 * as public in run-time and create new instance using that constructor.
 *
 */
public class ReflectionSingletonTester {
	
	public static void main(String[] args) {
		LazyInitializedSingleton inst1 = LazyInitializedSingleton.getInstance();
		
		LazyInitializedSingleton inst2 = null;
		
		try {
			Constructor<LazyInitializedSingleton> cons = LazyInitializedSingleton.class.getDeclaredConstructor();
			// Constructor visibility is made public
			cons.setAccessible(true);
			inst2 = cons.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Instance 1 hash:" + inst1.hashCode());
        System.out.println("Instance 2 hash:" + inst2.hashCode());
	}
}

// Both the instances have different hashcode. This indicates that singleton fails, which destroys the singleton pattern