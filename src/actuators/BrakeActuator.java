package actuators;

import controllers.Protocol;

public final class BrakeActuator 
implements Actuator{
	
	private int brakeIntensity;
	private Protocol brakeProtocol;


	public int getBrakeIntensity() {
		return brakeIntensity;
	}

	private void setBrakeIntensity(int brakeIntensity) {
		this.brakeIntensity = brakeIntensity;
	}

	public void setBrakeProtocol(Protocol brakeProtocol) {
		this.brakeProtocol = brakeProtocol;
	}

	public Protocol getBrakeProtocol() {
		return brakeProtocol;
	}

	@Override
	public void doAction(int measure) {
		this.setBrakeIntensity(measure);
	}
	
}
