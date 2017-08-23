package creational.singleton;

public class EnumDemo {

	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		
		System.out.println(singleton.hashCode());
		//singleton.setValue(2);
		System.out.println(singleton2.hashCode());
	}

}
