package com.ood.cp.builderPattern;

public abstract class AbstractBurger implements IItem{


	@Override
	public AbstractPackage packing() {
		return new PackageWrap();
	}

}
