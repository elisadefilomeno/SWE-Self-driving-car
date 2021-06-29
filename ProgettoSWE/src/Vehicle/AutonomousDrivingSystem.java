package Vehicle;

public class AutonomousDrivingSystem extends AbstractSubject {
	private int speed;
	private int accelerationIntensity;
	private int steeringWheelInclination;
	private Map3D map3d;
	private Protocol accelatorCommands;
	private Protocol brakeCommands;
	private Protocol steeringWheelCommands;
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAccelerationIntensity() {
		return accelerationIntensity;
	}
	public void setAccelerationIntensity(int accelerationIntensity) {
		this.accelerationIntensity = accelerationIntensity;
	}
	public Protocol getAccelatorCommands() {
		return accelatorCommands;
	}
	public void setAccelatorCommands(Protocol accelatorCommands) {
		this.accelatorCommands = accelatorCommands;
	}
	public Protocol getBrakeCommands() {
		return brakeCommands;
	}
	public void setBrakeCommands(Protocol brakeCommands) {
		this.brakeCommands = brakeCommands;
	}
	public Protocol getSteeringWheelCommands() {
		return steeringWheelCommands;
	}
	public void setSteeringWheelCommands(Protocol steeringWheelCommands) {
		this.steeringWheelCommands = steeringWheelCommands;
	}
	
	
	
}
