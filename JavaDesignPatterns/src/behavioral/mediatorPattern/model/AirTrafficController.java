package behavioral.mediatorPattern.model;

public interface AirTrafficController {
	void sendMessage(final Flight flight, final String message);
	void registerFlight(final Flight flight);
}
