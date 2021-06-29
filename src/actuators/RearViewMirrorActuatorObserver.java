package actuators;

import controllers.AccessoriesController;

public final class RearViewMirrorActuatorObserver  
implements IObserver, Actuator {
	
	private AccessoriesController bcm;
	private int rearViewInclination;

	public RearViewMirrorActuatorObserver(AccessoriesController bcm) {
		this.bcm = bcm;
		bcm.attach(this);
		}
	
	public int getRearViewInclination() {
		return rearViewInclination;
	}

	private void setRearViewInclination(int rearViewInclination) {
		this.rearViewInclination = rearViewInclination;
	}

	@Override
	public void update() {
		doAction(bcm.getRearViewInclination());		
	}

	@Override
	public void doAction(int measure) {
		this.setRearViewInclination(measure);		
	}
}
