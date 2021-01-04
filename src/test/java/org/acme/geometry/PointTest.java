package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testType(){
		// TODO
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}

}
