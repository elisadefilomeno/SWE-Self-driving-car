package actuators;

import controllers.AccessoriesController;

public final class PowerWindowActuatorObserver 
implements IObserver, Actuator {	
	
	private AccessoriesController bcm;
	private int windowHeight; 

	public PowerWindowActuatorObserver(AccessoriesController bcm) {
		this.bcm = bcm;
		bcm.attach(this);
	}
	
	public int getWindowHeight() {
		return windowHeight;
	}

	private void setWindowHeight(int windowHeight) {
		this.windowHeight = windowHeight;
	}
	
	@Override
	public void doAction(int measure) {
		this.setWindowHeight(measure);
		
	}
	
	@Override
	public void update() {
		doAction(bcm.getCarWindowHeight());
	}

}
