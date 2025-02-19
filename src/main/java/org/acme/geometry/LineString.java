package org.acme.geometry;
import java.util.List;
import java.util.ArrayList;

public class LineString extends AbstractGeometry {
	
	private List<Point> points;
	
	public LineString() {
		this.points = new ArrayList<Point>();
	}

	public LineString(List<Point> points) {
		this.points = points;
	}
	
	public int getNumPoints() {
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}
	
	@Override
	public String getType() {
		
		return "LineString";
	}
	
	@Override
	public boolean isEmpty() {
		if (this.points.size()==0) {
			return true;
	    }
	    else {
	    	return false;
	    }
	}

	@Override
	public void translate(double dx,double dy) {
	    for (int i = 0; i < this.points.size(); i++) {
	    	this.points.get(i).translate(dx,dy);
	    }
	    this.triggerChange();
    }
	
	@Override
    public LineString clone() {
        List<Point> newLine = new ArrayList<>(this.getNumPoints());
        for(Point pt : this.points) {
        	newLine.add(pt.clone());
        }
        return new LineString(newLine);
    }


	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void accept(WktVisitor visitor) {
		visitor.visit(this);
	}

}
