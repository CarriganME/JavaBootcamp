
public class Cat {
	private String name, awaked;
	private int lives;
	private final int CATLIVES = 9;
	
	public Cat (String catName) {  //initializes the dog object
		name = catName;
		lives = CATLIVES;
		awaked = "asleep";
		
	}
	
	public void nudge() {
		if (awaked.equals("asleep") ) {
			awaked = "awake";
		}
		else {
			awaked = "asleep";
		}
	}
	
	public void kill() {
		if(lives != 0){
			lives--;
		}
	}
	
	public String toString() {
		return name + " has " + lives + " lives and is " + awaked + ".";
	}
	
	
}
