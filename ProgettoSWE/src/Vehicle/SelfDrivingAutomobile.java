package Vehicle;

import java.util.Collection;

public class SelfDrivingAutomobile extends SelfDrivingVehicle{
public int numberOfWheels;


	protected SelfDrivingAutomobile(Collection<Sensor> sensors) {
	super(sensors);
	this.numberOfWheels = 4;
}

	@Override
	protected void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void slowDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void turn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void turnOff() {
		// TODO Auto-generated method stub
		
	}

}
