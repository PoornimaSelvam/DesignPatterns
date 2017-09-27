package behavioral.statePattern.model;

public class Vibration implements MobileAlertState {

	@Override
	public void alert() {
		System.out.println("Vibration...");
	}

}
