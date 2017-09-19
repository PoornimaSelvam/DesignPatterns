package structural.flyweightpattern.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight design pattern is used when we need to create a lot of Objects of a class. 
 * Since every object consumes memory space that can be crucial for low memory devices, 
 * such as mobile devices or embedded systems, flyweight design pattern can be applied 
 * to reduce the load on memory by sharing objects.
 * 
 * To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties. 
 * Intrinsic properties make the Object unique whereas extrinsic properties are set by client code and 
 * used to perform different operations
 * 
 * For applying flyweight pattern, we need to create a Flyweight factory that returns the shared objects.
 * 
 * example: The Code object is a light weighted object and there should also be one Code object per user code. 
 * But, the Platform is a heavy object which is used to set the execution environment. 
 * Creating too many Platform objects is time consuming, and a heavy task. 
 * We need to control the creation of the Platform object which can be done using the Flyweight Pattern
 * 
 * JDK Example: All the wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern. 
 * The best example is Java String class String Pool implementation.
 *
 */

public class PlatformFactory {
	private static Map<String, Platform> map = new HashMap<>();
	
	public static synchronized Platform getPlatformInstance(String language){
		Platform platform = map.get(language);
		if (platform == null) {
			switch (language) {
			case "C":
				platform = new CPlatform(language);
				break;
			case "RUBY":
				platform = new RubyPlatform(language);
				break;
			case "JAVA":
				platform = new JavaPlatform(language);
				break;
			}
			map.put(language, platform);
		}
		return platform;
	}
}
