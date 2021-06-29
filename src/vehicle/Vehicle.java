package vehicle;

import java.util.ArrayList;
import java.util.Collection;

import actuators.Actuator;
import controllers.AccessoriesController;
import controllers.AutonomousDrivingController;
import sensors.Sensor;

public class Vehicle{
	private String type;
	private Collection<Sensor> sensors;
	private Collection<Actuator> actuators;
	private AutonomousDrivingController adc;
	private AccessoriesController accessoriesController;

	private Vehicle() {}
	
	public static VehicleBuilder newVehicleBuilder(String type) {
		return new VehicleBuilder(type);
	}
	
	public static class VehicleBuilder{
		private String type;
		private Collection<Sensor> sensors;
		private Collection<Actuator> actuators;
		private AutonomousDrivingController adc;
		private AccessoriesController accessoriesController;
		
		private VehicleBuilder(String type) {
			this.type=type;
			this.sensors= new ArrayList<Sensor>();
			this.actuators= new ArrayList<Actuator>();
		}
		
		public VehicleBuilder withSensor(Sensor sensor) {
			this.sensors.add(sensor);
			return this;
		}
		
		public VehicleBuilder withAccessoriesController(AccessoriesController accessoriesController) {
			this.accessoriesController= accessoriesController;
			return this;
		}
		
		public VehicleBuilder withActuator(Actuator actuator) {
			this.actuators.add(actuator);
			return this;
		}
		
		public VehicleBuilder withAutonomousDrivingController(AutonomousDrivingController adc) {
			this.actuators.add(adc.getAcceleratorActuator());
			this.actuators.add(adc.getBrakeActuator());
			this.actuators.add(adc.getSteeringWheelActuator());
			this.adc=adc;
			return this;
		}
		
		public Vehicle build() {
			Vehicle vehicle = new Vehicle();
			vehicle.setType(type);
			vehicle.setSensors(sensors);
			vehicle.setActuators(actuators);
			vehicle.setAdc(adc);
			vehicle.setAccessoriesController(accessoriesController);
			return vehicle;
		}
	}
	
	private void setType(String type) {
		this.type = type;
	}

	private void setSensors(Collection<Sensor> sensors) {
		this.sensors = sensors;
	}

	private void setActuators(Collection<Actuator> actuators) {
		this.actuators = actuators;
	}

	private void setAdc(AutonomousDrivingController adc) {
		this.adc = adc;
	}

	private void setAccessoriesController(AccessoriesController accessoriesController) {
		this.accessoriesController = accessoriesController;
	}

	public Collection<Actuator> getActuators() {
		return actuators;
	}

	public Collection<Sensor> getSensors() {
		return sensors;
	}

	public String getType() {
		return type;
	}

	public AutonomousDrivingController getAdc() {
		return adc;
	}

	public AccessoriesController getAccessoriesController() {
		return accessoriesController;
	}
	
}
