package com.static_stack;

public class UnderflowException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnderflowException() {
		super("The stack is empty!");
	}
}
