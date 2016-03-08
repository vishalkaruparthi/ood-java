package com.ood.cp.abstractfactory;

public class WindowsLookAndFeel extends AbstractLookAndFeel{

	@Override
	public AbstractButton getButton() {
		return new WindowsButton();
	}

	@Override
	public AbstractTextBox getTextBox() {
		return new WindowsTextBox();
	}

}
