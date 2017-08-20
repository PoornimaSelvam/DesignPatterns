package creational.singleton;

/**
 * 
 * @author Poornima
 * 
 *  In this, we make the DoubleCheckLockingSingleton class in the synchronized block if the instance is null. 
 *  So, the synchronized block will be executed only when the instance is null and 
 *  prevent unnecessary synchronization once the instance variable is initialized.
 */
public class DoubleCheckLockingSingleton {
	
	private static DoubleCheckLockingSingleton instance;
	
	private DoubleCheckLockingSingleton() {}
	
	public static DoubleCheckLockingSingleton getInstance() {
		if(instance == null){ //Check for the first time
			
			synchronized (DoubleCheckLockingSingleton.class) { //Check for the second time.
				if(instance == null){
					instance = new DoubleCheckLockingSingleton();
				}
			}
		}
		return instance;
	}

}
