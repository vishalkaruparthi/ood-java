package com.ood.cp.factory;

public class OneProduct extends Product{
	private final static String factoryStringID = "ID1";
	static{
		System.out.println("creating...");
		ProductFactory.getInstance().registerProduct("ID1", new OneProduct());
	}
	public OneProduct createProduct(){
		return new OneProduct();
	}
	
	public void identify(){
		System.out.println("Hey, I am OneProduct class");
	}
	
	public String getID(){
		return factoryStringID;
	}
}
