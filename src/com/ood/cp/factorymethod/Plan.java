package com.ood.cp.factorymethod;

public abstract class Plan {
	public double rate;
	abstract int getRate();
	
	public void calculateBill(int units){
		System.out.println("Total bill amount is "+getRate()*units);
	}
}
