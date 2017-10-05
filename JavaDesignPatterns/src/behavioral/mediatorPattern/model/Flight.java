package behavioral.mediatorPattern.model;

public interface Flight {
	public String name();
	public void send(final String message);
	
	//java 8 default method implementation for interface
	default void receive(String message){
		System.out.println(name() + " received the message - " + message);
	}
}
