package actuators;

import controllers.AccessoriesController;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public final class WindscreenWiperActuatorObserver  
implements Observer, Actuator  {
	
	private AccessoriesController accessoriesController;
	private int windscreenWiperSpeed;

	public WindscreenWiperActuatorObserver(AccessoriesController accessoriesController) {
		this.accessoriesController = accessoriesController;
		accessoriesController.addObserver(this);
	}

	private void setWindscreenWiperSpeed(int windscreenWiperSpeed) {
		this.windscreenWiperSpeed = windscreenWiperSpeed;
	}

	public int getWindscreenWiperSpeed() {
		return windscreenWiperSpeed;
	}

	@Override
	public void doAction(int measure) {
		this.setWindscreenWiperSpeed(measure);
	}

	@Override
	public void update(Observable o, Object arg) {
		doAction(accessoriesController.getWindscreenWiperSpeed());
	}
}
