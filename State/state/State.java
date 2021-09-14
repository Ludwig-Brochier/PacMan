package state;

public class State {
	
	private Characters chars;
	public Characters getChars() {
		return chars;
	}
	public void setChars(Characters chars) {
		this.chars = chars;
	}
	
	private World world;
	public World getWorld() {
		return world;
	}
	public void setWorld(World world) {
		this.world = world;
	}
}
