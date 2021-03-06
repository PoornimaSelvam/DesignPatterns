package behavioral.statePattern.test;

import behavioral.statePattern.model.AlertStateContext;
import behavioral.statePattern.model.MobileAlertState;
import behavioral.statePattern.model.Silent;
import behavioral.statePattern.model.Vibration;

/**
 * State design pattern is used when an Object change its behavior based on its internal state.
 * 
 * If we have to change the behavior of an object based on its state, we can have a state variable in the Object. 
 * Then use if-else condition block to perform different actions based on the state. 
 * State design pattern is used to provide a systematic and loosely coupled way to achieve this through Context and State implementations.
 * 
 * State Pattern Context is the class that has a State reference to one of the concrete implementations of the State. 
 * Context forwards the request to the state object for processing.
 * 
 * Eg: javax.faces.lifecycle.LifeCycle#execute() 
 * (controlled by FacesServlet, the behavior is dependent on current phase (state) of JSF life cycle)
 *
 */
public class StatePatternTest {
	public static void main(String[] args) {
		AlertStateContext context = new AlertStateContext();
		MobileAlertState vibrate = new Vibration();
		MobileAlertState silent = new Silent();
		
		context.setCurrentState(vibrate);
		context.alert();
		context.alert();
		
		context.setCurrentState(silent);
		context.alert();
		context.alert();
	}
}
