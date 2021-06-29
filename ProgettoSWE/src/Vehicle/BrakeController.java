package Vehicle;

public class BrakeController implements IObserver{
	private ElectronicControlSystem VehicleSystem;
	private int intensity;
	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

}
