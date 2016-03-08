package com.ood.cp.prototype;

public class Circle extends Shape{

	public Circle(){
		type = "Circle";
	}
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
