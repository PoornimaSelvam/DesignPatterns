package behavioral.mediatorPattern.model;

public class KingFisher implements Flight {
	private AirTrafficController controller;
	
	public KingFisher(AirTrafficController controller) {
		this.controller = controller;
	}
	
	@Override
	public String name() {
		return "KingFisher";
	}

	@Override
	public void send(String message) {
		controller.sendMessage(this, message);
	}
}
