package com.static_stack;

public class NoNodesException extends Exception {

	private static final long serialVersionUID = 1L;

	public NoNodesException() {
		super("There are no nodes to show!");
	}
}
