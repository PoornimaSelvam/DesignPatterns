package creational.singleton;

/**
 * 
 * @author Poornima
 *
 * Is our singleton class thread safe? 
 * 
 * If two threads try to initialize our singleton class at almost the same time, what happens?
 */
public class CheckThreadSafeSingleton {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
				System.out.println("Instance 1 hash:" + instance1.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
				System.out.println("Instance 2 hash:" + instance2.hashCode());
			}
		});
		
		t1.start();
		//t1.sleep(10);
		t2.start();	
	}

}
// both the threads creates different instances (hashcodes).
// if i use ReflectionPreventionSingleton then we can see only one thread usage and throws runtime exception
// If i use synchronized used in getInstance method of ReflectionPreventionSingleton then second thread will have to 
// wait until the getInstance() method is completed for the first thread.