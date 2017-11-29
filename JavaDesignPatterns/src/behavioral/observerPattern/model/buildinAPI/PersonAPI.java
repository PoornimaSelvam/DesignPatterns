package behavioral.observerPattern.model.buildinAPI;

import java.util.Observable;
import java.util.Observer;

public class PersonAPI implements Observer {
	
	String personName;
	
	public PersonAPI(String personName) {
		super();
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public void update(Observable observable, Object obj) {
		System.out.println("Hello "+personName+", Product is now "+obj+" on flipkart");
	}

}
