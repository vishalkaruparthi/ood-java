package com.ood.dp.openclose;

public class GraphicEditor {
	public void draw(Shape s){
		s.draw();
	}
	
	public static void main(String[] args) {
		Shape s = new Rectangle();
		Shape s2 = new Circle();
		GraphicEditor g = new GraphicEditor();
		g.draw(s);
		g.draw(s2);
		
	}
}
