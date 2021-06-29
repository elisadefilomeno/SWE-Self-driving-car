package Vehicle;

public abstract class LidarSensor extends Sensor{
	public Map3D map;
	
	public abstract Map3D elaborateNew3DMap();
}
