package behavioral.chainOfResponsibilityPattern.model;

public class Rupee50Dispenser implements DispenseChain {
	
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency curr) {
		if(curr.getAmount()>=50){
			int num = curr.getAmount()/50;
			int remainder = curr.getAmount()%50;
			System.out.println("Dispensing " +num+ " 50 Rupee note");
			if(remainder!=0){
				this.chain.dispense(new Currency(remainder));
			}
		} else{
			this.chain.dispense(curr);
		}
	}

}
