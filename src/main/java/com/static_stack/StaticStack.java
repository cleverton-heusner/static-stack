package com.static_stack;

import com.static_stack.OverflowException;
import com.static_stack.UnderflowException;

public class StaticStack {

	private int maxSize;
	private int top;
	private int[] nodes;

	public StaticStack emptyWithMaxSize(final int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		nodes = new int[maxSize];
		return this;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void push(final int node) throws OverflowException {
		boolean stackIsFull = top >= maxSize - 1;

		if (stackIsFull) {
			throw new OverflowException();
		}

		nodes[++top] = node;
	}

	public void pop() throws UnderflowException {
		boolean stackIsEmpty = top < 0;

		if (stackIsEmpty) {
			throw new UnderflowException();
		}

		--top;
	}

	public int top() throws NoNodesException {
		if (top == -1) {
			throw new NoNodesException();
		}

		return nodes[top];
	}
}
