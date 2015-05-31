package battleShips;

public abstract class BattleShip {
	
	private int damage;
	private int health;
	private int speed;
	private String name;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int attackEnemy(){
		System.out.println( getName()+ " ship just did " + damage + " damage");
		return damage;		
	}
	
	public void getAttacked(int enemyDamage){
		System.out.println("Oh No! "+ getName() +" just got hit and have suffered" + enemyDamage+ "damage");
		health = health- enemyDamage;
		System.out.println(getName() + " health is now : " + health + " HP ");
	}
	
	public void showAttributes(){
		System.out.println(getName() + " has the following attributes: ");
		System.out.println("Health : " + getHealth());
		System.out.println("Damage : " + getDamage());
		System.out.println("Speed : " + getSpeed());
	}
	
}
