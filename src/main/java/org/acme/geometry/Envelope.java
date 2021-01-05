package org.acme.geometry;

public class Envelope {
	
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Envelope() {
		this.bottomLeft = new Coordinate();
		this.topRight = new Coordinate();
	}
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	

	public Coordinate getBottomLeft() {
		return bottomLeft;
	}

	public Coordinate getTopRight() {
		return topRight;
	}
	
	public boolean isEmpty() {
		return this.getBottomLeft().isEmpty() | this.getTopRight().isEmpty();
	}
	
	public double getXmin() {
		return Math.min(this.getTopRight().getX(), this.getBottomLeft().getX());
	}
	
	public double getYmin() {
		return Math.min(this.getTopRight().getY(), this.getBottomLeft().getY());
	}
	
	public double getXmax() {
		return Math.max(this.getTopRight().getX(), this.getBottomLeft().getX());
	}
	
	public double getYmax() {
		return Math.max(this.getTopRight().getY(), this.getBottomLeft().getY());
	}
}
