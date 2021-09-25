package com.eg1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class FirstJUnitEg {

	static ArithBusinessLogic obj;
	static IArithService ias;

	// execute before class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");

		obj = new ArithBusinessLogic();
		ias = mock(IArithService.class);

		obj.setIAService(ias);
	}

	// execute after class
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	// execute before test
	@Before
	public void before() {
		System.out.println("in before");

	}

	// execute after test
	@After
	public void after() {
		System.out.println("in after");
	}

	// test case
	@Test
	public void test1() {

		// add the behavior to add numbers
		when(ias.iadd(20, 10)).thenReturn(30);
		// thenThrow()

		Assert.assertEquals(obj.add(20, 10), 30);

		System.out.println("in test1");

	}

	// test case
	@Test
	public void test2() {
		// subtract the behavior to subtract numbers
		when(ias.isub(20, 10)).thenReturn(10);

		Assert.assertEquals(obj.sub(20, 10), 10);
		System.out.println("in test2");
	}

	// test case - 1A. Subtraction of negative numbers
	@Test
	public void test3() {
		// subtract the behavior to subtract numbers
		when(ias.isub(-8, -8)).thenReturn(-0);

		Assert.assertEquals(obj.sub(-8, -8), -0);
		System.out.println("in test3");
	}

	// test case - 1B. Addition of Max integer values
	@Test
	public void test4() {
		int a = 0, b = 0;
		// subtract the behavior to subtract numbers
		when(ias.iadd(a, b)).thenReturn((a + b));

		Assert.assertEquals(obj.add(Integer.MAX_VALUE, Integer.MAX_VALUE), (2 * Integer.MAX_VALUE));
		System.out.println("in test4");
	}

	// test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("in ignore test");
	}
}