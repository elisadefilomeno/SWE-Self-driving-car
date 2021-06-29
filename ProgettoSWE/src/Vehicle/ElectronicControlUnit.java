package Vehicle;

public abstract class ElectronicControlUnit{
	private Vehicle vehicleToWhichBelongs;

	public ElectronicControlUnit(Vehicle vehicleToWhichBelongs) {
		this.vehicleToWhichBelongs = vehicleToWhichBelongs;
	}
	
}
