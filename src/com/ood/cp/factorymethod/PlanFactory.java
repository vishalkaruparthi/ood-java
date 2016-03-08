package com.ood.cp.factorymethod;

public class PlanFactory {
	public Plan getPlan(String type){
		Plan p;
		switch (type) {
		case "DOMESTIC":
			p = new DomesticPlan();
			break;
		case "RESIDENTIAL":
			p = new ResidentialPlan();
			break;
		default:
			p = null;
			break;
		}
		return p;
	}
	
	public static void main(String[] args){
		PlanFactory pf = new PlanFactory();
		Plan p = pf.getPlan("DOMESTIC");
		p.calculateBill(100);
	}
}
