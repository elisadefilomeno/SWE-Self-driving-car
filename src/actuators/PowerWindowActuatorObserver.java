package actuators;

import controllers.AccessoriesController;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")

public final class PowerWindowActuatorObserver 
implements Observer, Actuator {	
	
	private AccessoriesController accessoriesController;
	private int windowHeight; 
	

	public PowerWindowActuatorObserver(AccessoriesController bcm) {
		this.accessoriesController = bcm;
		accessoriesController.addObserver(this);
	}
	
	@Override
	public void doAction(int measure) {
		this.setWindowHeight(measure);
	}

	@Override
	public void update(Observable o, Object arg) {
		doAction(accessoriesController.getCarWindowHeight());
	}
	
	private void setWindowHeight(int windowHeight) {
		this.windowHeight = windowHeight;
	}
	
	public int getWindowHeight() {
		return windowHeight;
	}
	
}
