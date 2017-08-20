package creational.singleton;

import java.io.Serializable;

/**
 * 
 * @author Poornima
 * 
 * Sometimes in distributed systems, we need to implement Serializable interface in Singleton class 
 * so that we can store it’s state in file system and retrieve it at later point of time. 
 */
public class SerializedSingleton implements Serializable{

	private static final long serialVersionUID = 6120950011419385146L;
	
	private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
    /**
     * The readResolve() method replaces the object read from the stream. 
     * This ensures that nobody can create another instance by serializing and deserializing the singleton.
     * @return
     */
    protected Object readResolve(){
		return getInstance();
    }
}

// The problem with de-serialization is it always creates a new instance.
// To overcome this scenario all we need to do it provide the implementation of readResolve() method. 
// readResolve method returns the existing instance to ensure single instance.