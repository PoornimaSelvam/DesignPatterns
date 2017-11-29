package behavioral.visitorPattern.model;

public class Book implements ItemElement {
	
	private static int TAX = 12;
    private String isbn;
    private float price;
    private int qty;
	
	public Book(String isbn, float price, int qty) {
		this.isbn = isbn;
		this.price = price;
		this.qty = qty;
	}

	public static int getTAX() {
		return TAX;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getQty() {
		return qty;
	}
	
	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public float accept(ShoppingCartVisitor v) {
		return v.visit(this);
	}

}
