package com.factoryDesignPatternExample.java;

public class Apple implements Mobile {
	private int ram;
	private String mobileProcessor;
	private int storageInGB;
	
	public Apple(int ram, String mobileProcessor, int storageInGB) {
		this.ram = ram;
		this.mobileProcessor = mobileProcessor;
		this.storageInGB = storageInGB;
	}

}
