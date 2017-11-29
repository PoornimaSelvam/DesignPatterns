package behavioral.visitorPattern.model;

public interface ItemElement {
	float accept(final ShoppingCartVisitor v);
    float getPrice();
}
