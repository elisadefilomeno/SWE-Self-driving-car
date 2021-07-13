package controllers;

import java.util.Observable;

@SuppressWarnings("deprecation")


public class AccessoriesController 
extends Observable
{
	private int rearViewInclination;
	private int windscreenWiperSpeed;
	private int powerWindowHeight;
	

	public void setRearViewInclination(int rearViewInclination) {
		this.rearViewInclination = rearViewInclination;
		this.setChanged();
		notifyObservers();
	}
	
	public void setWindscreenWiperSpeed(int windscreenWiperSpeed) {
		this.windscreenWiperSpeed = windscreenWiperSpeed;
		this.setChanged();
		notifyObservers();
	}
	public void setCarWindowHeight(int carWindowHeight) {
		this.powerWindowHeight = carWindowHeight;
		this.setChanged();
		notifyObservers();
	}
	
	public int getRearViewInclination() {
		return rearViewInclination;
	}
	
	public int getCarWindowHeight() {
		return powerWindowHeight;
	}
	
	public int getWindscreenWiperSpeed() {
		return windscreenWiperSpeed;
	}
}
