package OODSpring2021.Week3;
public class Knight extends Character {
	public Knight() {
		weapon = new AxeBehavior();
	}
	public void fight() {
		System.out.println("kNIGHT cannot do it alone!");
	}

	
}
