package behavioral.chainOfResponsibilityPattern.model;

public interface DispenseChain {
	
	public void setNextChain(DispenseChain nextChain);

	public void dispense(Currency curr);
}
