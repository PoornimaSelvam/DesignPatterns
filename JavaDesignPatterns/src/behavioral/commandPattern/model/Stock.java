package behavioral.commandPattern.model;

public class Stock {
	
	private TYPE type;
	private int quantity;
	
	public Stock(TYPE type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}
	
	public void buy()
    {
        System.out.println("Buying " + quantity + " amount of " + type);
    }
    
    public void sell()
    {
        System.out.println("Selling " + quantity + " amount of " + type);
    }

	public enum TYPE
	{
		BOOKS, PENS, PENCILS, ERASER
	}
	
}
