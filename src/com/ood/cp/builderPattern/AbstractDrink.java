package com.ood.cp.builderPattern;

public abstract class AbstractDrink implements IItem{

	@Override
	public AbstractPackage packing(){
		return new BottlePackage();
	}
}
