package behavioral.visitorPattern.model;

/**
 * Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects.
 * With the help of visitor pattern, we can move the operational logic from the objects to another class.
 * Represents an operation to be performed on the elements of an object structure without changing the classes on which it operates
 *
 * The benefit is, if the logic of operation changes, then we need to make change only in the visitor implementation rather than doing it in all the item classes.
 * Another benefit is, adding a new item to the system is easy, it will require change only in visitor interface and implementation and existing item classes will not be affected.
 * 
 * Eg. Shopping cart. When we click on checkout button, it calculates the total amount to be paid.
 * Now we can have the calculation logic in item classes or we can move out this logic to another class using visitor pattern.
 * 
 */
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public float visit(Fruit f) {
		final float amt = Math.round(f.getPrice() * f.getWeight());
		return amt + (amt * Fruit.getTAX()) / 100;
	}

	@Override
	public float visit(Book b) {
		final float amt = Math.round(b.getPrice() * b.getQty());
		return amt + (amt * Book.getTAX()) / 100;
	}

}
