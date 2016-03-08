package com.ood.cp.abstractfactory;

public class IOSLookAndFeel extends AbstractLookAndFeel{

	@Override
	public AbstractButton getButton() {
		return new IOSButton();
	}

	@Override
	public AbstractTextBox getTextBox() {
		return new IOSTextBox();
	}

}
