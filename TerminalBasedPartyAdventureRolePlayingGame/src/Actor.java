
public class Actor {

	private String job = "Untrained";
	private int atk = 0;
	private int def = 0;
	private int maxHp = 0;
	
	private int damage = 0;
	
	public Actor(int a, int d, int h) {
		
	}
	
	public int getHp() {
		int hp = maxHp - damage;
		if (hp < 0) {
			hp = 0;
		}
		return hp;
	}
	
	public int getDefence() {
		return this.def;
	}
	
	public int getAttack() {
		return this.atk;
	}
	
	
}