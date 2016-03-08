package com.ood.cp.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<IItem> items = new ArrayList<IItem>();
	public void addItems(IItem item){
		items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		for (IItem iItem : items) {
			cost += iItem.getPrice();
		}
		return cost;
	}
	
	public void showItems(){
		for (IItem iItem : items) {
			System.out.println("Item Name: "+iItem.getName());
			System.out.println("Item Price: "+iItem.getPrice());
			System.out.println("Item Package: "+iItem.packing().getPackageType());
		}
	}
}
