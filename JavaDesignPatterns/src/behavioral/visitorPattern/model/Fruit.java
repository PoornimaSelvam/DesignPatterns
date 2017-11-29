package behavioral.visitorPattern.model;

public class Fruit implements ItemElement{
	
	private static int TAX = 10;
	private String name;
	private float weight;
	private float price;
	
	public Fruit(String name, float weight, float price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public static int getTAX() {
		return TAX;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
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
