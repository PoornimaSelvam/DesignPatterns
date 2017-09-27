package behavioral.statePattern.model;

public class AlertStateContext {
	private MobileAlertState currentState;
	
	public void setCurrentState(MobileAlertState currentState) {
		this.currentState = currentState;
	}
	
	public MobileAlertState getCurrentState() {
		return this.currentState;
	}

	public void alert() {
		currentState.alert();
	}
}
