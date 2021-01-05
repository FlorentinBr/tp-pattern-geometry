package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractGeometry implements Geometry {
	
	private List<GeometryListener> listeners = new ArrayList<GeometryListener>();


	@Override
    public abstract Geometry clone();

	@Override
	public String asText() {
		WktVisitor visitor = new WktVisitor();
		this.accept(visitor);
		return visitor.getResult();
	}
	
	@Override
    public Envelope getEnvelope() {
        EnvelopeBuilder builder = new EnvelopeBuilder();
        accept(builder);
        return builder.build();
    }
	
	protected void triggerChange() {
        for(int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onChange(this);
        }
    }

	public List<GeometryListener> getListeners() {
		return listeners;
	}
	
	public void addListener(GeometryListener listener) {
		this.getListeners().add(listener);
	}
	
}
