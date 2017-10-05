package behavioral.mediatorPattern.model;

public class SpiceJet implements Flight {
	private AirTrafficController controller;
	
	public SpiceJet(AirTrafficController controller) {
		this.controller = controller;
	}
	
	@Override
	public String name() {
		return "SpiceJet";
	}

	@Override
	public void send(String message) {
		controller.sendMessage(this, message);
	}
}
