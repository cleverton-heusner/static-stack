package com.static_stack.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.static_stack.NoNodesException;
import com.static_stack.OverflowException;
import com.static_stack.UnderflowException;

public class PopingTest extends BaseTest {

	@Test
	public void should_ShowTopNode_When_PopingWithStackHavingMoreThanOneNode()
			throws UnderflowException, NoNodesException, OverflowException {
		int initialNode = 1;

		stack.push(initialNode);
		stack.push(2);
		stack.pop();

		assertThat(stack.top(), is(equalTo(initialNode)));
	}

	@Test
	public void should_ThrowException_When_ShowTopNodeAfterPopingWithStackHavingExactlyOneNode()
			throws UnderflowException, NoNodesException, OverflowException {
		stack.push(1);
		stack.pop();

		exceptedException.expect(NoNodesException.class);
		exceptedException.expectMessage(is("There are no nodes to show!"));

		stack.top();
	}

	@Test
	public void should_ThrowException_When_PopingAEmptyStack() throws UnderflowException {
		exceptedException.expect(UnderflowException.class);
		exceptedException.expectMessage(is("The stack is empty!"));

		stack.pop();
	}
}