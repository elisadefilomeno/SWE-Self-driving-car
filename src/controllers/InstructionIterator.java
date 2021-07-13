package controllers;

import java.util.Iterator;

public final class InstructionIterator implements Iterator<Instruction> {
	private Protocol protocol;


	public InstructionIterator(Protocol protocol) {
		super();
		this.protocol = protocol;
	}

	@Override
	public boolean hasNext() {
		return protocol.getInstructions().iterator().hasNext();
	}

	@Override
	public Instruction next() {
		return protocol.getInstructions().iterator().next();
	}
}
