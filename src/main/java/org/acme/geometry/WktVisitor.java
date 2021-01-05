package org.acme.geometry;

public class WktVisitor implements GeometryVisitor {
	
	private StringBuilder buffer;
	
	public WktVisitor() {
		this.buffer = new StringBuilder();
	}

	public StringBuilder getBuffer() {
		return buffer;
	}
	
	public String getResult() {
		return this.getBuffer().toString();
	}

	@Override
    public void visit(Point point) {
		if(point.isEmpty()) {
	    	buffer.append("POINT EMPTY");
	    }
	    else {
	    	buffer.append("POINT(" + point.getCoordinate().getX() + " " + point.getCoordinate().getY() + ")");
	    }

    }

	@Override
    public void visit(LineString lineString) {
		if(lineString.isEmpty()) {
	    	buffer.append("LINESTRING EMPTY");
	    }
	    else {
	    	String str = "LINESTRING(";
	    	for(int i = 0; i < lineString.getNumPoints(); i++) {
	    		str = str + lineString.getPointN(i).getCoordinate().getX() + " " + lineString.getPointN(i).getCoordinate().getY() + ",";
	    	}
	    	str = str.substring(0,str.length()-1);
	    	str = str + ")";
	    	buffer.append(str);
	    }
    }
}
