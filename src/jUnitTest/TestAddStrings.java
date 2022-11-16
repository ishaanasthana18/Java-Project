package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
