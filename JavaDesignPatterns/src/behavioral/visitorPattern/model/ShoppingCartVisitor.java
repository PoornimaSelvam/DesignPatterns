package behavioral.visitorPattern.model;

public interface ShoppingCartVisitor {
	 float visit(final Fruit f);
	 float visit(final Book b);
}
