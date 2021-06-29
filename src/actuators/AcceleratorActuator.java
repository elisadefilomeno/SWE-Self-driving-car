package actuators;

import controllers.Protocol;

public final class AcceleratorActuator 
implements Actuator{
	
	private int accelerationIntensity;
	private Protocol acceleratorProtocol;


	public int getAccelerationIntensity() {
		return accelerationIntensity;
	}

	private void setAccelerationIntensity(int accelerationIntensity) {
		this.accelerationIntensity = accelerationIntensity;
	}
	
	public void setAcceleratorCommands(Protocol acceleratorProtocol) {
		this.acceleratorProtocol = acceleratorProtocol;
		}
	
	public Protocol getAcceleratorProtocol() {
		return acceleratorProtocol;
	}

	@Override
	public void doAction(int measure) {
		this.setAccelerationIntensity(measure);	
	}	
	
}
