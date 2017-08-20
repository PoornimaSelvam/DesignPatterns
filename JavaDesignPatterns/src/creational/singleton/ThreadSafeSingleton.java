package creational.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadSafeSingleton();
		}
		
		return instance;
	}

}
//As we made our getInstance() class synchronized the second thread will have to wait until the getInstance() method 
//is completed for the first thread. This way we can achieve thread safety. 
//But, there are some cons of using this approach:
// 1. Slow performance because of locking overhead. (cost associated with the synchronized method)
// 2. Unnecessary synchronization that is not required once the instance variable is initialized.