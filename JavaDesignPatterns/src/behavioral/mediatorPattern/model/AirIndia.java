package behavioral.mediatorPattern.model;

public class AirIndia implements Flight {

	private AirTrafficController controller;
	
	public AirIndia(AirTrafficController controller) {
		this.controller = controller;
	}
	
	@Override
	public String name() {
		return "AirIndia";
	}

	@Override
	public void send(String message) {
		controller.sendMessage(this, message);
	}

}
