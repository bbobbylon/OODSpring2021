package OODSpring2021.Week3;
public abstract class Character {
	//reference variable for behavior interface types
	WeaponBehavior weapon;
	
	public Character() {}
	public void fight() {
		weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
}
