package creational.singleton;

/**
 * 
 * @author Poornima
 * 
 *  In this, we make the DoubleCheckLockingSingleton class in the synchronized block if the instance is null. 
 *  So, the synchronized block will be executed only 
 *  when the instance is null for the 2nd thread and returns the instance if already exists.
 */
public class DoubleCheckLockingSingleton {
	
	private static DoubleCheckLockingSingleton instance;
	
	private DoubleCheckLockingSingleton() {}
	
	public static DoubleCheckLockingSingleton getInstance() {
		if(instance == null){ //Check for the first time
			System.out.println("First if");
			synchronized (DoubleCheckLockingSingleton.class) { //Check for the second time.
				System.out.println("Inside synchornized block");
				if(instance == null){
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}

}
