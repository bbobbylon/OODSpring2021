package OODSpring2021.Week3;
public class Troll extends Character {
	public Troll() {
		weapon = new KnifeBehavior();
	}
	
	public void fight() {
		System.out.println("Troll gonna looooooooose");
	}


}
