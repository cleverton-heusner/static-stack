package com.static_stack.test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import com.static_stack.StaticStack;

public abstract class BaseTest {

	protected static final int STACK_SIZE = 2;

	@Rule
	public ExpectedException exceptedException = ExpectedException.none();
	protected StaticStack stack;

	@Before
	public void setup() {
		stack = new StaticStack().emptyWithMaxSize(STACK_SIZE);
	}
}
