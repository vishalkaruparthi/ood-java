package com.ood.cp.factory;

public class MainClass {
	
	public static void main(String[] args){
		OneProduct op = new OneProduct();
		ProductFactory pf = ProductFactory.getInstance();
		
		Product p = pf.createProduct("ID1");
		p.identify();
		
	}
}
