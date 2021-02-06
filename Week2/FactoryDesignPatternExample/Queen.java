package OODSpring2021.Week3;
public class Queen extends Character{
	public Queen() {
		weapon = new BowAndArrowBehavior();
	}
	public void fight() {
		System.out.println("Queen usually wins if with the King");
	}


}
