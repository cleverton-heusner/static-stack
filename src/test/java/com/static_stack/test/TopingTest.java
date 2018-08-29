package com.static_stack.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.static_stack.NoNodesException;
import com.static_stack.OverflowException;

public class TopingTest extends BaseTest {

	private int topNode;

	@Test
	public void should_ShowTopNode_When_AtLeastOneNodeIsPresent() throws OverflowException, NoNodesException {
		topNode = 1;
		stack.push(topNode);

		assertThat(stack.top(), is(equalTo(topNode)));
	}

	@Test
	public void should_ThrowException_When_StackIsEmpty() throws NoNodesException {
		exceptedException.expect(NoNodesException.class);
		exceptedException.expectMessage(is("There are no nodes to show!"));

		stack.top();
	}
}
