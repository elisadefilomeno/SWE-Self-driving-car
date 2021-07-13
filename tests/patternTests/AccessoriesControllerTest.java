package patternTests;

import static org.junit.Assert.*;
import org.junit.Test;

import actuators.PowerWindowActuatorObserver;
import actuators.RearViewMirrorActuatorObserver;
import actuators.WindscreenWiperActuatorObserver;
import controllers.AccessoriesController;

public class AccessoriesControllerTest {
	
	@Test
	public void test() {
				
		AccessoriesController bcm = new AccessoriesController();
		
		PowerWindowActuatorObserver WindowController = new PowerWindowActuatorObserver(bcm);
		RearViewMirrorActuatorObserver MirrorController = new RearViewMirrorActuatorObserver(bcm);
		WindscreenWiperActuatorObserver WiperController = new WindscreenWiperActuatorObserver(bcm);
		
		bcm.setCarWindowHeight(5);
		bcm.setRearViewInclination(12);
		bcm.setWindscreenWiperSpeed(17);
		
		assertEquals(5, WindowController.getWindowHeight());
		assertEquals(12, MirrorController.getRearViewInclination());
		assertEquals(17, WiperController.getWindscreenWiperSpeed());
	}
}
