package com.static_stack.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.static_stack.NoNodesException;
import com.static_stack.OverflowException;

public class PushingTest extends BaseTest {

	private int topNode;

	@Test
	public void should_pushNode_When_StackIsEmpty() throws OverflowException, NoNodesException {
		topNode = 1;
		stack.push(topNode);

		assertThat(stack.top(), is(equalTo(topNode)));
	}

	@Test
	public void should_pushNode_When_ItIsTheLastOne() throws OverflowException, NoNodesException {
		topNode = 2;

		stack.push(1);
		stack.push(topNode);

		assertThat(stack.top(), is(equalTo(topNode)));
	}

	@Test
	public void should_ThrowException_When_TheStackIsFull() throws OverflowException {
		int notPushedNode = 3;

		fillStack();

		exceptedException.expect(OverflowException.class);
		exceptedException.expectMessage(is("The stack is full!"));

		stack.push(notPushedNode);
	}

	private void fillStack() throws OverflowException {
		for (int i = 1; i <= stack.getMaxSize(); i++) {
			stack.push(i);
		}
	}
}
