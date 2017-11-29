package behavioral.mementoPattern.model;

public class Memento {
	private String state;

	public Memento(String state) {
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
}
