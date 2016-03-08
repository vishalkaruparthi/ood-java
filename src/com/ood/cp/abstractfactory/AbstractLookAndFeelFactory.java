package com.ood.cp.abstractfactory;

public class AbstractLookAndFeelFactory {
	public AbstractLookAndFeel getLookAndFeelFactory(String type){
		if(type.equalsIgnoreCase("WINDOWS")){
			return new WindowsLookAndFeel();
		}else{
			return new IOSLookAndFeel();
		}
	}
}
