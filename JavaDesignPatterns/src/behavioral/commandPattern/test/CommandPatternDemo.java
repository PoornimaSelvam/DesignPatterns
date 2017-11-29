package behavioral.commandPattern.test;

import behavioral.commandPattern.model.BuyStock;
import behavioral.commandPattern.model.SellStock;
import behavioral.commandPattern.model.Stock;

import static behavioral.commandPattern.model.Stock.TYPE.BOOKS;
import static behavioral.commandPattern.model.Stock.TYPE.ERASER;

import behavioral.commandPattern.model.Broker;

public class CommandPatternDemo {
	public static void main(String[] args) {
		BuyStock buy = new BuyStock(new Stock(BOOKS, 10));
		SellStock sell = new SellStock(new Stock(ERASER, 15));
		
		Broker broker = new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		
		broker.placeOrders();
	}
}	
