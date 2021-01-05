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
	
	@Test
    public void testGetEnvelope(){
        Point a = SampleFactory.createPointA();
        Assert.assertEquals(3.0,a.getEnvelope().getTopRight().getX(), EPSILON);
        Assert.assertEquals(4.0,a.getEnvelope().getTopRight().getY(), EPSILON);
        Assert.assertEquals(3.0,a.getEnvelope().getBottomLeft().getX(), EPSILON);
        Assert.assertEquals(4.0,a.getEnvelope().getBottomLeft().getY(), EPSILON);
    }

}
