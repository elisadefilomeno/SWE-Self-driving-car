package patternTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Test;

import actuators.AcceleratorActuator;
import actuators.BrakeActuator;
import actuators.SteeringWheelActuator;
import controllers.AutonomousDrivingController;
import controllers.Instruction;
import controllers.Protocol;

public class ProtocolTest {

	@Test
	public void test() {
		AcceleratorActuator acceleratorActuator= new AcceleratorActuator();
		BrakeActuator brakeActuator= new BrakeActuator();
		SteeringWheelActuator steeringWheelActuator= new SteeringWheelActuator();
		AutonomousDrivingController adECU = new AutonomousDrivingController(acceleratorActuator, brakeActuator, steeringWheelActuator);

		
		Collection<Instruction> accelatorCommands_Uturn = new ArrayList<>();
		Collection<Instruction> steeringWheelCommands_Uturn = new ArrayList<>();
		Collection<Instruction> brakeCommands_Uturn = new ArrayList<>();
				
		
		accelatorCommands_Uturn.add(new Instruction(()->{acceleratorActuator.doAction(-3);}));
		accelatorCommands_Uturn.add(new Instruction(()->{acceleratorActuator.doAction(3);}));
		steeringWheelCommands_Uturn.add(new Instruction(()->{steeringWheelActuator.doAction(-180);;}));
		steeringWheelCommands_Uturn.add(new Instruction(()->{steeringWheelActuator.doAction(0);;}));
		brakeCommands_Uturn.add(new Instruction(()->{brakeActuator.doAction(3);}));
		brakeCommands_Uturn.add(new Instruction(()->{brakeActuator.doAction(-3);}));
		
		Protocol acceleratorProtocol = new Protocol(accelatorCommands_Uturn);
		Protocol steeringWheelProtocol = new Protocol(steeringWheelCommands_Uturn);
		Protocol brakeProtocol = new Protocol(brakeCommands_Uturn);
		
		acceleratorActuator.setAcceleratorCommands(acceleratorProtocol);
		steeringWheelActuator.setSteeringWheelProtocol(steeringWheelProtocol);
		brakeActuator.setBrakeProtocol(brakeProtocol);
		
		adECU.autonomousDrive();
		assertEquals(3, acceleratorActuator.getAccelerationIntensity());
		assertEquals(0, steeringWheelActuator.getSteeringWheelInclination());
		assertEquals(-3, brakeActuator.getBrakeIntensity());
		
	}
}
