package actuators;

import controllers.AccessoriesController;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public final class RearViewMirrorActuatorObserver  
implements Observer, Actuator {
	
	private AccessoriesController accessoriesController;
	private int rearViewMirrorInclination;

	public RearViewMirrorActuatorObserver(AccessoriesController accessoriesController) {
		this.accessoriesController = accessoriesController;
		accessoriesController.addObserver(this);
		}
	
	public int getRearViewInclination() {
		return rearViewMirrorInclination;
	}

	private void setRearViewInclination(int rearViewInclination) {
		this.rearViewMirrorInclination = rearViewInclination;
	}

	@Override
	public void doAction(int measure) {
		this.setRearViewInclination(measure);		
	}

	@Override
	public void update(Observable o, Object arg) {
		doAction(accessoriesController.getRearViewInclination());	
	}
}
