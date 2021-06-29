package controllers;

import actuators.AcceleratorActuator;
import actuators.BrakeActuator;
import actuators.SteeringWheelActuator;

public class AutonomousDrivingController
{
	private AcceleratorActuator acceleratorActuator;
	private BrakeActuator brakeActuator;
	private SteeringWheelActuator steeringWheelActuator;
	
	
	public AutonomousDrivingController(AcceleratorActuator acceleratorActuator, BrakeActuator brakeActuator,
			SteeringWheelActuator steeringWheelActuator) {
		this.acceleratorActuator = acceleratorActuator;
		this.brakeActuator = brakeActuator;
		this.steeringWheelActuator = steeringWheelActuator;
	}

	public void autonomousDrive() {
		while(acceleratorActuator.getAcceleratorProtocol().isNotFinished()||
			  brakeActuator.getBrakeProtocol().isNotFinished()||
			  steeringWheelActuator.getSteeringWheelProtocol().isNotFinished()) {
		
		acceleratorActuator.getAcceleratorProtocol().executeNextInstruction();
		brakeActuator.getBrakeProtocol().executeNextInstruction();
		steeringWheelActuator.getSteeringWheelProtocol().executeNextInstruction();
		}
	}

	public AcceleratorActuator getAcceleratorActuator() {
		return acceleratorActuator;
	}

	public BrakeActuator getBrakeActuator() {
		return brakeActuator;
	}

	public SteeringWheelActuator getSteeringWheelActuator() {
		return steeringWheelActuator;
	}	
}
