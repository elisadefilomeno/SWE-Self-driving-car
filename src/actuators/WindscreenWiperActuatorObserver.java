package actuators;

import controllers.AccessoriesController;

public final class WindscreenWiperActuatorObserver  
implements IObserver, Actuator  {
	
	private AccessoriesController bcm;
	private int windscreenWiperSpeed;

	public WindscreenWiperActuatorObserver(AccessoriesController bcm) {
		this.bcm = bcm;
		bcm.attach(this);
	}

	@Override
	public void update() {
		doAction(bcm.getWindscreenWiperSpeed());
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
	
	

}
