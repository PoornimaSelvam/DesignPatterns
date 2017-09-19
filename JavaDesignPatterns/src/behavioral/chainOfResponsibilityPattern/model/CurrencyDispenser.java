package behavioral.chainOfResponsibilityPattern.model;

public class CurrencyDispenser {
	private DispenseChain baseChain;
	
	public CurrencyDispenser(){
		//initialize the chain
		this.baseChain = new Rupee50Dispenser();
		DispenseChain ru20 = new Rupee20Dispenser();
		DispenseChain ru10 = new Rupee10Dispenser();
		
		//set the chain of Responsibility
		baseChain.setNextChain(ru20);
		ru20.setNextChain(ru10);
	}
	
	public void dispenseAmount(final int amount) {
		//process the request
		baseChain.dispense(new Currency(amount));
	}
}
