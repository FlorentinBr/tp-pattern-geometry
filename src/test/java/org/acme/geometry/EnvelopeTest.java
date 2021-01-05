package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {

	@Test
	    public void testEnvelopeIsEmpty() {
	        Envelope eOA = SampleFactory.createEnvelopeOA();
	        Assert.assertTrue(!eOA.isEmpty());

	        Envelope e = new Envelope();
	        Assert.assertTrue(e.isEmpty());
	    }
}
