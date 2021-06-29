package controllers;

public class AccessoriesController 
extends AbstractSubject
{
	private int rearViewInclination;
	private int windscreenWiperSpeed;
	private int PowerWindowHeight;
	
	public int getRearViewInclination() {
		return rearViewInclination;
	}
	public void setRearViewInclination(int rearViewInclination) {
		this.rearViewInclination = rearViewInclination;
		notifyObservers();
	}
	public int getWindscreenWiperSpeed() {
		return windscreenWiperSpeed;
	}
	public void setWindscreenWiperSpeed(int windscreenWiperSpeed) {
		this.windscreenWiperSpeed = windscreenWiperSpeed;
		notifyObservers();
	}
	public int getCarWindowHeight() {
		return PowerWindowHeight;
	}
	public void setCarWindowHeight(int carWindowHeight) {
		this.PowerWindowHeight = carWindowHeight;
		notifyObservers();
	}

}
