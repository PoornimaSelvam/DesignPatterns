package creational.singleton;

public class LazyInitializedSingletonTester {
	
	public static void main(String[] args) {
		
		LazyInitializedSingleton t1 = LazyInitializedSingleton.getInstance();
		
		LazyInitializedSingleton t2 = LazyInitializedSingleton.getInstance();
		
		System.out.println("Instance of t1 hash: " + t1.hashCode());
		System.out.println("Instance of t2 hash: " + t2.hashCode());
	}
}
