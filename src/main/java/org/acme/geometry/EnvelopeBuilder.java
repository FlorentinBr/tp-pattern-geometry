package org.acme.geometry;
import java.util.ArrayList;
import java.util.Collections;

public class EnvelopeBuilder {
	
	private ArrayList<Double> listX;
 	private ArrayList<Double> listY;
 	
	public EnvelopeBuilder() {
		this.listX = new ArrayList<Double>();
		this.listY = new ArrayList<Double>();
	}
	
	public EnvelopeBuilder(ArrayList<Double> listX, ArrayList<Double> listY) {
		this.listX = listX;
		this.listY = listY;
	}
	
	public void insert(Coordinate coordinate) {
		this.listX.add(coordinate.getX());
		this.listY.add(coordinate.getY());
	}

	public Envelope build() {
        Coordinate c1 = new Coordinate(Collections.min(listX,null),Collections.min(listY,null));
        Coordinate c2 = new Coordinate(Collections.max(listX,null),Collections.max(listY,null));
        return new Envelope(c1,c2);
    }
}
