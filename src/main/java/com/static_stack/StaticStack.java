package com.static_stack;

import com.static_stack.OverflowException;
import com.static_stack.UnderflowException;

public class StaticStack<NODE extends Object> {

	private static final int IND_EMPTY_STACK = -1;

	private int maxSize;
	private int top;
	private NODE[] nodes;

	@SuppressWarnings("unchecked")
	public StaticStack<NODE> emptyWithMaxSize(final int maxSize) {
		this.maxSize = maxSize;
		top = IND_EMPTY_STACK;
		nodes = (NODE[]) new Object[maxSize];
		return this;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public StaticStack<NODE> push(final NODE node) throws OverflowException {
		boolean stackIsFull = top >= maxSize - 1;

		if (stackIsFull) {
			throw new OverflowException();
		}

		nodes[++top] = node;
		return this;
	}

	public StaticStack<NODE> pop() throws UnderflowException {
		if (stackIsEmpty()) {
			throw new UnderflowException();
		}

		--top;
		return this;
	}

	private boolean stackIsEmpty() {
		return top < 0;
	}

	public NODE top() throws NoNodesException {
		if (stackIsEmpty()) {
			throw new NoNodesException();
		}

		return nodes[top];
	}
}
