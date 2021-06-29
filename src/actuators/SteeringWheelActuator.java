package actuators;

import controllers.Protocol;

public final class SteeringWheelActuator 
implements Actuator{
	
	private int steeringWheelInclination;
	private Protocol steeringWheelProtocol;
	
	public int getSteeringWheelInclination() {
		return steeringWheelInclination;
	}
	private void setSteeringWheelInclination(int steeringWheelInclination) {
		this.steeringWheelInclination = steeringWheelInclination;
	}
	public Protocol getSteeringWheelProtocol() {
		return steeringWheelProtocol;
	}
	public void setSteeringWheelProtocol(Protocol steeringWheelProtocol) {
		this.steeringWheelProtocol = steeringWheelProtocol;
	}
	@Override
	public void doAction(int measure) {
		this.setSteeringWheelInclination(measure);
	}
	
	
}