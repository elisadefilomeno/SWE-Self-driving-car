package Vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class AUProtocol extends Protocol{
	private ElectronicControlSystem VehicleSystem;
	

	public AUProtocol(){
		AcceleratorController my_acceleratorController = new AcceleratorController();
		BrakeController my_brakeController = new BrakeController();
		SteeringWheelController my_steeringWheelController = new SteeringWheelController();
		
		Collection<Consumer<Integer>> my_acceleratorCommands = new ArrayList<>();
		Collection<Consumer<Integer>> my_brakeCommands = new ArrayList<>();
		Collection<Consumer<Integer>> my_steeringWheelCommands = new ArrayList<>();
		
		Integer current_speed = Integer.valueOf(VehicleSystem.getSpeed());
		my_acceleratorCommands.add(currentIntensity -> my_acceleratorController.setIntensity(currentIntensity-(currentIntensity*current_speed)));
		my_brakeCommands.add(currentIntensity -> my_brakeController.setIntensity(currentIntensity+(currentIntensity*current_speed)));
		my_steeringWheelCommands.add(currentIntensity -> my_steeringWheelController.setIntensity(currentIntensity-(currentIntensity*current_speed)));


		this(my_acceleratorCommands, my_brakeCommands, my_steeringWheelCommands);

	}


	private AUProtocol(Collection<Consumer<Integer>> my_acceleratorCommands,
			Collection<Consumer<Integer>> my_brakeCommands, Collection<Consumer<Integer>> my_steeringWheelCommands) {
		super(my_acceleratorCommands, my_brakeCommands, my_steeringWheelCommands);
	}

}
