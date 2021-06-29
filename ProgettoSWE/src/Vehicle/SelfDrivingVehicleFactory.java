package Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public class SelfDrivingVehicleFactory {
	
	public SelfDrivingVehicle createSelfDrivingAutomobile() {
		Collection<Sensor> sensors = new ArrayList<Sensor>();
		return new SelfDrivingAutomobile();
	}
	
	public SelfDrivingVehicle createSelfDrivingMotorcycle() {
		return new SelfDrivingMotorcycle();
		
	}

}
