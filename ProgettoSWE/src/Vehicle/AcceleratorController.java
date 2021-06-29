package Vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class AcceleratorController implements IObserver{
private AutonomousDrivingSystem observedSystem;
private int intensity;
private Collection<Consumer<Integer>> acceleratorCommands;


	@Override
	public void update() {
		this.acceleratorCommands= new ArrayList<Consumer<Integer>>(this.currentSystemProtocol.getAcceleratorCommands());
		this.executeCommands();
	}
	
	private void executeCommands() {
		Iterator<Consumer<Integer>> iterator = acceleratorCommands.iterator();
		while(iterator.hasNext()) {
			iterator.next().accept(this.intensity);
			}
	}
	


	public int getIntensity() {
		return intensity;
	}


	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	

}
