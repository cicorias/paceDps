package tests;

import static org.junit.Assert.*;
import junit.framework.Assert;


import org.junit.Test;

import simpleApplication.*;

public class ProgramTests {

	@Test
	public void test() {
		
		Program p = new Program();
		String actual = p.helloWorld();
		
		Assert.assertEquals("Hello world", actual);
		
		

	}

}
