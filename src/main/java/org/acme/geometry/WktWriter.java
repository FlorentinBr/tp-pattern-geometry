package org.acme.geometry;
import java.lang.String;


public class WktWriter {
	
	public WktWriter() {

    }
	
	public String write(Geometry geometry) {
		if ( geometry instanceof Point ){
		    Point point = (Point)geometry;
		    if(point.isEmpty()) {
		    	return "POINT EMPTY";
		    }
		    else {
		    	return "POINT(" + point.getCoordinate().getX() + " " + point.getCoordinate().getY() + ")";
		    }
		}else if ( geometry instanceof LineString ){
		    LineString lineString = (LineString)geometry;
		    if(lineString.isEmpty()) {
		    	return "LINESTRING EMPTY";
		    }
		    else {
		    	String str = "LINESTRING(";
		    	for(int i = 0; i < lineString.getNumPoints(); i++) {
		    		str = str + lineString.getPointN(i).getCoordinate().getX() + " " + lineString.getPointN(i).getCoordinate().getY() + ",";
		    	}
		    	str = str.substring(0,str.length()-1);
		    	str = str + ")";
		    	return str;
		    }
		}else{
		    throw new RuntimeException("geometry type not supported");
		}
	}

}
