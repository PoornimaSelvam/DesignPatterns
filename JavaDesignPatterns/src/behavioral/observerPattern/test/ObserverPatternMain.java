package behavioral.observerPattern.test;

import behavioral.observerPattern.model.Person;
import behavioral.observerPattern.model.Product;
import behavioral.observerPattern.model.buildinAPI.PersonAPI;
import behavioral.observerPattern.model.buildinAPI.ProductAPI;

public class ObserverPatternMain {
	public static void main(String[] args) {
		/*Person pooPerson = new Person("Poornima");
		Person chetuPerson = new Person("Chetna");
		
		Product iPhone = new Product("Apple iPhone", "Mobile", "Not available");*/
		
		PersonAPI pooPerson = new PersonAPI("Poornima");
		PersonAPI chetuPerson = new PersonAPI("Chetna");
		
		ProductAPI iPhone = new ProductAPI("Apple iPhone", "Mobile", "Not available");
		
		iPhone.registerObserver(pooPerson);
		iPhone.registerObserver(chetuPerson);
		
		//iPhone.notifyObservers();
		
		iPhone.setAvailability("Available");
		
		//iPhone.notifyObservers();
	}
}
