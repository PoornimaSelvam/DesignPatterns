package creational.builderpattern.model;

/**
 * Builder Pattern is used to solve problem related to object creation.
 * Constructors in Java are used to create object and take parameters required to create object.
 * Problem starts when object has to be created with lot of parameters some may be mandatory and others optional.
 * 
 * Problems:
	1) too many constructors to maintain.
	2) error prone because many fields has same type.
	
	Builder design pattern not only improves readability but also reduces chance of error 
	by adding ingredients explicitly and making object available once fully constructed.
	
Guidelines for Builder design pattern:
1) Make a static nested class called Builder(BurgerMaker) inside the class whose object will be build by Builder.
2) Builder class will have exactly same set of fields as original class.
3) Builder class will expose method for adding ingredients e.g. cheese(), veggie() in this example. 
each method will return same Builder object. Builder will be enriched with each method call.
4) Builder.build() method will copy all builder field values into actual class and return object of Item class.
5) Item class (class for which we are creating Builder) should have private constructor to create its object 
from build() method and prevent outsider to access its constructor.

Examples:
java.lang.StringBuilder#append() (unsynchronized)
java.lang.StringBuffer#append() (synchronized)

 *
 */
public class Burger {
	private String bun;
	private String vada;
	private String cheese;
	private String veggie;

	private Burger(BurgerMaker prototype) {
		if (prototype != null) {
			this.bun = prototype.bun;
			this.vada = prototype.vada;
			this.cheese = prototype.cheese;
			this.veggie = prototype.veggie;
		}
	}

	public String getBun() {
		return bun;
	}

	public String getVada() {
		return vada;
	}

	public String getCheese() {
		return cheese;
	}

	public String getVeggie() {
		return veggie;
	}

	@Override
	public String toString() {
		StringBuilder burger = new StringBuilder();
		if (bun != null && bun.trim() != "")
			burger.append("\nBun --> " + getBun());
		if (vada != null && vada.trim() != "")
			burger.append("\nVada --> " + getVada());
		if (cheese != null && cheese.trim() != "")
			burger.append("\nCheese" + getCheese());
		if (veggie != null && veggie.trim() != "")
			burger.append("\nVeggie --> " + getVeggie());
		return burger.toString();
	}

	// static inner class
	public static class BurgerMaker {
		// copy all the properties
		private String bun;
		private String vada;
		private String cheese;
		private String veggie;

		// public constructor
		public BurgerMaker(final String bun, final String vada) {
			this.bun = bun;
			this.vada = vada;
		}

		// optional setters
		public BurgerMaker cheese(final String cheese) {
			this.cheese = cheese;
			return this;
		}

		public BurgerMaker veggie(final String veggie) {
			this.veggie = veggie;
			return this;
		}

		// build the object
		public Burger build() {
			return new Burger(this);
		}
	}
}
