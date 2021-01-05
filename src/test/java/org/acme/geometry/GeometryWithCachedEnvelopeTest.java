package org.acme.geometry;


import org.junit.Test;
import org.junit.Assert;

public class GeometryWithCachedEnvelopeTest {

    @Test 
    public void testGeometryWithCachedEnvelopePoint(){
        Geometry g = SampleFactory.createPointA();
        g = new GeometryWithCachedEnvelope(g);
        Envelope a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
        Envelope b = g.getEnvelope() ; // renvoi de cachedEnvelope
        Assert.assertSame(a,b);
    }

    @Test 
    public void testGeometryWithCachedEnvelopeLineString(){
        Geometry g = SampleFactory.createLineStringOA();
        g = new GeometryWithCachedEnvelope(g);
        Envelope a = g.getEnvelope() ; // calcul et stockage dans cachedEnvelope
        Envelope b = g.getEnvelope() ; // renvoi de cachedEnvelope
        Assert.assertSame(a,b);
    }
}