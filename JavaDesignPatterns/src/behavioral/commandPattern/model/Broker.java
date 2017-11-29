package behavioral.commandPattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Command pattern is a data driven design pattern. A request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and passes the command to 
 * the corresponding object which executes the command.
 * 
 * 1. Command - Order, 2. Request - Stock 3. Invoker - Broker
 *
 */
public class Broker {

	private List<Order> orderList = new ArrayList<Order>();

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrders() {

		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}

}
