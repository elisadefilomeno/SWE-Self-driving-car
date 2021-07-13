package patternTests;

import static org.junit.Assert.*;
import org.junit.Test;

import actuators.AcceleratorActuator;
import actuators.BrakeActuator;
import actuators.PowerWindowActuatorObserver;
import actuators.SteeringWheelActuator;
import controllers.AccessoriesController;
import controllers.AutonomousDrivingController;
import sensors.FrontalRadar;
import sensors.OpticalCamera;
import sensors.Sensor;
import vehicle.Vehicle;

public class VehicleTest {

	@Test
	public void test() {
		AccessoriesController accessoriesController = new AccessoriesController();
		Sensor camera = new OpticalCamera();
		Vehicle auto = Vehicle.newVehicleBuilder("automobile")
				.withSensor(camera)
				.withSensor(new FrontalRadar())
				.withAccessoriesController(accessoriesController)
				.withActuator(new PowerWindowActuatorObserver(accessoriesController))
				.withAutonomousDrivingController
				(new AutonomousDrivingController(new AcceleratorActuator(), new BrakeActuator(), new SteeringWheelActuator()))
				.build();
		
		
		assertSame(accessoriesController, auto.getAccessoriesController());
		assertEquals("automobile", auto.getType());
		assertTrue(auto.getSensors().contains(camera));
	}
}
