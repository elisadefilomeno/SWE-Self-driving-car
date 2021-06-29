package Vehicle;


public class Instruction {
	private Runnable instruction;
	
	public void execute() {
		this.instruction.run();
	}

}
