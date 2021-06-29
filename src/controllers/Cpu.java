package controllers;

import java.util.Collection;

import actuators.Actuator;
import environmentSystem.NavigationSystem;
import sensors.Sensor;

public abstract class Cpu {
	private Collection<Sensor> sensors;
	private Collection<Actuator> actuators;
	private NavigationSystem navigationSystem;

	public abstract Collection<Protocol> elaborate();

}
