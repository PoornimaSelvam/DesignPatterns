package creational.factoryPattern.test;

import creational.factoryPattern.model.Currency;
import creational.factoryPattern.model.CurrencyFactory;

public class CurrencyFactoryDemo {
	
	 public static void main(String[] args) {
		 
		CurrencyFactory currencyFactory = new CurrencyFactory();
		// factory instantiates the object
		Currency curr = currencyFactory.getCurrencyByCountry("IN");
		
		System.out.println("Currency: " + curr.getCurrency());
		
		System.out.println("Currency symbol: " + curr.getSymbol());
	}
}
