package Vehicle;

public class CarWindowControllerObserver extends ElectronicControlUnit implements IObserver {
	private int windowHeight; 

	public CarWindowControllerObserver(Vehicle vehicleToWhichBelongs) {
		super(vehicleToWhichBelongs);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void setWindowHeight(int windowHeight) {
		this.windowHeight = windowHeight;
	}
	

}
