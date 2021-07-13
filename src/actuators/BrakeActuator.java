package actuators;

import controllers.Protocol;

public final class BrakeActuator 
implements Actuator{
	
	private int brakeIntensity;
	private Protocol brakeProtocol;
	
	@Override
	public void doAction(int measure) {
		this.setBrakeIntensity(measure);
	}
	
	private void setBrakeIntensity(int brakeIntensity) {
		this.brakeIntensity = brakeIntensity;
	}

	public int getBrakeIntensity() {
		return brakeIntensity;
	}

	public void setBrakeProtocol(Protocol brakeProtocol) {
		this.brakeProtocol = brakeProtocol;
	}

	public Protocol getBrakeProtocol() {
		return brakeProtocol;
	}
}
