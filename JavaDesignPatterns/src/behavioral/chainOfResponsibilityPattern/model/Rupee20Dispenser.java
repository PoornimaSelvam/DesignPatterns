package behavioral.chainOfResponsibilityPattern.model;

public class Rupee20Dispenser implements DispenseChain{
	
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency curr) {
		if(curr.getAmount()>=20){
			int num = curr.getAmount()/20;
			int remainder = curr.getAmount()%20;
			System.out.println("Dispensing " +num+ " 20 Rupee note");
			if(remainder!=0){
				this.chain.dispense(new Currency(remainder));
			}
		} else {
			this.chain.dispense(curr);
		}
	}

}
