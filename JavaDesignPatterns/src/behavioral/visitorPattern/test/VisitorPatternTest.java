package behavioral.visitorPattern.test;

import java.util.Arrays;
import java.util.List;

import behavioral.visitorPattern.model.Book;
import behavioral.visitorPattern.model.Fruit;
import behavioral.visitorPattern.model.ItemElement;
import behavioral.visitorPattern.model.ShoppingCartVisitor;
import behavioral.visitorPattern.model.ShoppingCartVisitorImpl;

public class VisitorPatternTest {
	
	public static void main(String[] args) {
		Book b1 = new Book("isbn1", 15, 3);
		Book b2 = new Book("isbn2", 20, 2);
		
		Fruit f1 = new Fruit("Apple", 50, 1.5f);
		Fruit f2 = new Fruit("Banana", 30, 2.5f);
		
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		List<ItemElement> elements = Arrays.asList(b1, b2, f1, f2);
		
		float total = 0;
		for(ItemElement e : elements){
			total += e.accept(visitor);
		}
		
		System.out.println("Total order value = " + Math.round(total));
	}
}
