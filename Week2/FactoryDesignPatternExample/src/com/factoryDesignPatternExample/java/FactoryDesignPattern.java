package com.factoryDesignPatternExample.java;

public class FactoryDesignPattern {
	public static Mobile createMobile(String type) {
		if(type.equals(Mobile.APPLE)) {
			System.out.println("This is an apple with 128 gb storage");
			return new Apple(12,"AChip", 128);
		} 
		else if (type.equals(Mobile.samsung)){
			System.out.println("This is a samsung with an RTX GPu");
			return new Samsung(16, "S21", "RTX");
		}
		else if(type.equals(Mobile.lg)) {
			System.out.println("This is your basic flagship device");
			return new LG(8,"LGChip");
		}
		else if(type.equals(Mobile.motorolla)) {
			System.out.println("I would consider upgrading your phone");
			return new Motorolla(12,"M14", 256, 2 );
		}
		else {
			return null;
		}


}
}
