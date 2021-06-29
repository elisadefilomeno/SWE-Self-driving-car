package Vehicle;

public class RearViewMirrorControllerObserver 
extends ElectronicControlUnit 
implements IObserver{
	
	private int rearViewInclination;

	public RearViewMirrorControllerObserver(Vehicle vehicleToWhichBelongs) {
		super(vehicleToWhichBelongs);
	}

	public void setInclination(int inclination) {
		this.rearViewInclination = inclination;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	

}
