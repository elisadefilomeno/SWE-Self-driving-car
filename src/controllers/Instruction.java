package controllers;


public class Instruction{
	private Runnable instruction;


	public Instruction(Runnable instruction) {
		this.instruction = instruction;
	}

	public void execute() {
		this.instruction.run();
	}

}
