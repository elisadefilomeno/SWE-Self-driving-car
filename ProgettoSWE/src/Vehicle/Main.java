package Vehicle;

import java.util.function.Consumer;
import static Vehicle.AcceleratorController.*;

public class Main {

	public static void main(String[] args) {
		AcceleratorController my_accelerator = new AcceleratorController();
		
		Consumer<Integer> istruzione1  =  my_accelerator::setIntensity;
		Consumer<Integer> istruzione2  =  my_accelerator::setIntensity;
		Consumer<Integer> istruzione3  =  my_accelerator::setIntensity;
		Consumer<Integer> istruzione4  =  my_accelerator::setIntensity;
		Consumer<Integer> istruzione5  =  my_accelerator::setIntensity;
		
		istruzione1.accept(6);
		
		System.out.println(my_accelerator.getIntensity());
		
		
		

	}

}
