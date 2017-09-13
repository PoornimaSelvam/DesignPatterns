package structural.decoratorpattern.test;

import structural.decoratorpattern.model.HoneyDecorator;
import structural.decoratorpattern.model.Icecream;
import structural.decoratorpattern.model.NuttyDecorator;
import structural.decoratorpattern.model.SimpleIcecream;

/**
 * Decorator design pattern is used to modify the functionality of an object at runtime. 
 * Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible. 
 * Its easy to maintain and extend when the number of choices are more.
 * Decorator pattern is used in Java IO classes, such as FileReader, BufferedReader etc.
 *
 */
public class DecoratorTest {

	public static void main(String[] args) {
		Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
		System.out.println(icecream.makeIcecream());
	}

}
