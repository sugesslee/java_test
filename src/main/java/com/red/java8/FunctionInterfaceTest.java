package com.red.java8;

import org.junit.Test;

/**
 * function interface test
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/07/30     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019-07-30 17:53
 * @since 1.0.0
 */
public class FunctionInterfaceTest {

	@Test
	public void testLambda() {
		func(new FunctionInterface() {
			@Override
			public void test() {
				System.out.println("test lambda use traditional");
			}
		});

		func(() -> System.out.println("test lambda use lambda"));
	}

	private void func(FunctionInterface functionInterface) {
		functionInterface.test();
	}
}
