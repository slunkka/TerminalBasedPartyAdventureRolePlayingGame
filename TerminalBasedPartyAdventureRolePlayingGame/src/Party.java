import java.util.ArrayList;

public class Party {
	
	public ArrayList<Actor> actors = new ArrayList<Actor>();
	
	public Party() {
		
	}
	
	public ArrayList<Actor> getActors() {
		return this.actors;
	}
	
	private int getSize() {	
		return actors.size();
	}
	
	private int getPower () {
		int power = 0;
		for (Actor unit : actors) {
			power += unit.getAttack();
		}
		
		return power;
	}
	
	private int getHp () {
		int hp = 0;
		for (Actor unit : actors) {
			hp += unit.getHp();
		}
		
		return hp;
	}
	
	private int getDefende () {
		int def = 0;
		for (Actor unit : actors) {
			def += unit.getDefence();
		}
		
		return def;
	}
	
	

}
