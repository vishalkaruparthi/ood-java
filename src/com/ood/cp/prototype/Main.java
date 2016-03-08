package com.ood.cp.prototype;

public class Main {
	public static void main(String[] args){
		ShapeCache.setShapes();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
	    System.out.println("Shape : " + clonedShape.getType());
	}
}
