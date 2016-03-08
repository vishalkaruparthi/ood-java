package com.ood.cp.prototype;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeTable = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeID){
		Shape cachedShape = shapeTable.get(shapeID);
		return (Shape) cachedShape.clone();
	}
	
	public static void setShapes(){
		Circle c = new Circle();
		c.setId("1");
		shapeTable.put(c.getId(), c);
	}
}
