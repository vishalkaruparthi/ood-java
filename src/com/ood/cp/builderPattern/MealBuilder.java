package com.ood.cp.builderPattern;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItems(new VegBurger());
		meal.addItems(new CokeDrink());
		return meal;
	}
	
	public Meal prepareChickenMeal(){
		Meal meal = new Meal();
		meal.addItems(new ChickenBurger());
		meal.addItems(new PepsiDrink());
		return meal;
	}
	
	public static void main(String[] args){
		MealBuilder mb = new MealBuilder();
		Meal chickenMeal = mb.prepareChickenMeal();
		chickenMeal.showItems();
		System.out.println("TOtal price: "+chickenMeal.getCost());
		
	}
}
