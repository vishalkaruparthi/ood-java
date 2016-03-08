package com.ood.cp.abstractfactory;

public class Main {
	public static void main(String[] args){
		AbstractLookAndFeelFactory af = new AbstractLookAndFeelFactory();
		AbstractLookAndFeel a = af.getLookAndFeelFactory("IOS");
		AbstractButton ab = a.getButton();
		AbstractTextBox at = a.getTextBox();
		ab.identify();
		at.identify();
	}
}
