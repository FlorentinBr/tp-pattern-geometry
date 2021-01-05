package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeBuilderTest {

    public static final double EPSILON = 1.0e-15;

    @Test
    public void testEnvelopeBuilder() {
        EnvelopeBuilder builder = new EnvelopeBuilder();
        builder.insert(new Coordinate(0.0,1.0));
        builder.insert(new Coordinate(2.0,2.0));
        builder.insert(new Coordinate(3.0,4.0));
        Envelope result = builder.build();
        Assert.assertEquals(3.0,result.getTopRight().getX(), EPSILON);
        Assert.assertEquals(4.0,result.getTopRight().getY(), EPSILON);
        Assert.assertEquals(0.0,result.getBottomLeft().getX(), EPSILON);
        Assert.assertEquals(1.0,result.getBottomLeft().getY(), EPSILON);
    }

}