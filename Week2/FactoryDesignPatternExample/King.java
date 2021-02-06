package OODSpring2021.Week3;
public class King extends Character{
	public King() {
		weapon = new SwordBehavior();
	}
	public void fight() {
		System.out.println("King always wins.");
	}

	

}
