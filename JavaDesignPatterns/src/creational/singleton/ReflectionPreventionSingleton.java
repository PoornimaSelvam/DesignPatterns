package creational.singleton;

/**
 * 
 * @author Poornima
 *
 * To prevent singleton failure while due to reflection we have to throw a run-time exception in constructor, 
 * if the constructor is already initialized and some class to initialize it again. 
 */
public class ReflectionPreventionSingleton {
	private static ReflectionPreventionSingleton inst;
	
	private ReflectionPreventionSingleton() {
		//Prevent form the reflection api.
		if (inst != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
	}
	
	public static ReflectionPreventionSingleton getInstance() {
		if(inst == null){
			inst = new ReflectionPreventionSingleton();
		}
		return inst;
	}
}
