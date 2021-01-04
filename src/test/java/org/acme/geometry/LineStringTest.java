package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

    public static final double EPSILON = 1.0e-15;


    @Test
    public void testGetNumPoints() {
        Coordinate c = new Coordinate(3.0,4.0);
        Point p = new Point(c);
        List<Point> lp = new ArrayList<Point>();
        lp.add(p);
        LineString l = new LineString(lp);
        Assert.assertEquals(1,l.getNumPoints(), EPSILON);
    }

    @Test
    public void testGetPointN() {
        Coordinate c = new Coordinate(3.0,4.0);
        Point p = new Point(c);
        List<Point> lp = new ArrayList<Point>();
        lp.add(p);
        LineString l = new LineString(lp);
        Assert.assertEquals(3.0,l.getPointN(0).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(4.0,l.getPointN(0).getCoordinate().getY(), EPSILON);
    }

    @Test
    public void testGetType(){
        LineString l = new LineString();
        Assert.assertEquals("LineString",l.getType());
    }

}