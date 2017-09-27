package behavioral.statePattern.model;

public class Silent implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Silent...");
	}

}
