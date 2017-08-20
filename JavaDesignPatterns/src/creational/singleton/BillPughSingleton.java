package creational.singleton;

/**
 * 
 * @author Poornima
 *
 * Approaches used earlier used to fail prior to java 5 due to memory issues when too many threads try to get the 
 * instance of the singleton simultaneously. So Bill Pugh came up with a different approach to 
 * create the Singleton class using a inner static helper class.  
 */
public class BillPughSingleton {
	
	private BillPughSingleton(){}
	
	private static class SingletonHelper{
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

}

// Note: The private inner static class that contains the instance of the singleton class. 
// When the singleton class is loaded, SingletonHelper class is not loaded into memory and 
// only when someone calls the getInstance method, this class gets loaded and 
// creates the Singleton class instance. This is the most widely used approach for Singleton class 
// as it doesn’t require synchronization.