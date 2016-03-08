package com.ood.cp.factory;

import java.util.HashMap;

public class ProductFactory {
	private static ProductFactory instance;
	
	private ProductFactory(){
		
	}
	
	public static ProductFactory getInstance(){
		if(instance == null){
			synchronized (ProductFactory.class) {
				if(instance == null){
					instance = new ProductFactory();
				}
			}
		}
		return instance;
	}
	
	private HashMap<String, Object> products_map = new HashMap<>();
	public void registerProduct(String ID, Product p){
		products_map.put(ID, p);
	}
	
	public Product createProduct(String ID){
		return ((Product) products_map.get(ID)).createProduct();
	}
}
