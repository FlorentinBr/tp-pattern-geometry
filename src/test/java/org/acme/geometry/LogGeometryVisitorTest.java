package org.acme.geometry;

import org.junit.Test;

public class LogGeometryVisitorTest {

    @Test
    public void testGeometryVisitor(){
        LogGeometryVisitor visitor = new LogGeometryVisitor();
        Geometry geometryPoint = SampleFactory.createPointA();
        geometryPoint.accept(visitor);
        Geometry geometryLine = SampleFactory.createLineStringOA();
        geometryLine.accept(visitor);
    }
}