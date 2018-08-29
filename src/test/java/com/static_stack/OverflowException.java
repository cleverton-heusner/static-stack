package com.static_stack;

public class OverflowException extends Exception {

	private static final long serialVersionUID = 1L;

	public OverflowException() {
		super("The stack is full!");
	}
}
