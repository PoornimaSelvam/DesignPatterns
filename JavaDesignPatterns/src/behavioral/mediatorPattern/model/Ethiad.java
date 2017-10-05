package behavioral.mediatorPattern.model;

public class Ethiad implements Flight {
	private AirTrafficController controller;
	
	public Ethiad(AirTrafficController controller) {
		this.controller = controller;
	}
	
	@Override
	public String name() {
		return "Ethiad";
	}

	@Override
	public void send(String message) {
		controller.sendMessage(this, message);
	}
}
