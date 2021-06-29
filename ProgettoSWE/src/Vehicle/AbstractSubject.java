package Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractSubject {
	private Collection<IObserver> observers = new ArrayList<>();
	
	public void attach(IObserver observer) {
		observers.add(observer);
	}
	public void detach(IObserver observer) {
		observers.remove(observer);
	}
	protected void notifyObservers() {
		observers.forEach(IObserver::update);
	}
}
