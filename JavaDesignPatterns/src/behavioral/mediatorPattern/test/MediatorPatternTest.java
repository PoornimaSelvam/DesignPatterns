package behavioral.mediatorPattern.test;

import behavioral.mediatorPattern.model.AirIndia;
import behavioral.mediatorPattern.model.AirTrafficController;
import behavioral.mediatorPattern.model.AirTrafficControllerImpl;
import behavioral.mediatorPattern.model.Ethiad;
import behavioral.mediatorPattern.model.Flight;
import behavioral.mediatorPattern.model.KingFisher;
import behavioral.mediatorPattern.model.SpiceJet;

public class MediatorPatternTest {
	public static void main(String[] args) {
		AirTrafficController controller = new AirTrafficControllerImpl();
		
		Flight sj = new SpiceJet(controller);
		Flight kf = new KingFisher(controller);
		Flight ai = new AirIndia(controller);
		Flight ei = new Ethiad(controller);
		
		controller.registerFlight(sj);
		controller.registerFlight(kf);
		controller.registerFlight(ai);
		controller.registerFlight(ei);
		
		sj.send(sj.name() + "landing in terminal xxx in 10mins");
	}
}
