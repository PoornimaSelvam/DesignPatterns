package creational.singleton;

import java.io.*;

public class SerializedSingletonTester {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
	}
}
// If readResolve() method is not used then the hashcodes will be different.