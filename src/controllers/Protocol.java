package controllers;
import java.util.Collection;
import java.util.Iterator;


public class Protocol implements Iterable<Instruction>{
	private Collection<Instruction> instructions;
	private Iterator<Instruction> currentInstruction;

	public Protocol(Collection<Instruction> instructions) {
		this.instructions = instructions;
		currentInstruction= this.instructions.iterator();
	}

	@Override
	public Iterator<Instruction> iterator() {
		return this.instructions.iterator();
	}  
	
	public void executeNextInstruction() {
		if(this.currentInstruction.hasNext()) {
			this.currentInstruction.next().execute();
			}
	}
	
	public boolean isNotFinished() {
		return currentInstruction.hasNext();
    }
	
}
