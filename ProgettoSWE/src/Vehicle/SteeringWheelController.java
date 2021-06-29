package Vehicle;
import Vehicle.AbstractSubject;

public class SteeringWheelController implements IObserver{
	private ElectronicControlSystem VehicleSystem;
	private int intensity;
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
	}


	public void setIntensity(int itensity) {
		this.intensity = itensity;
	}
	

}