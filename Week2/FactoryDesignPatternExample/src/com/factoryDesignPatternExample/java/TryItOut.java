package com.factoryDesignPatternExample.java;

public class TryItOut {
	public static void main(String[] args) {
		Mobile mobile = FactoryDesignPattern.createMobile(Mobile.samsung);
		Mobile mobile1 = FactoryDesignPattern.createMobile(Mobile.APPLE);
		Mobile mobile2 = FactoryDesignPattern.createMobile(Mobile.lg);
		Mobile mobile3 = FactoryDesignPattern.createMobile(Mobile.motorolla);
	}
}
