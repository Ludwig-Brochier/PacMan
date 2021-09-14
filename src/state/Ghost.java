package state;

public class Ghost extends MobileElement {
	
	private GhostStatus status;
	public GhostStatus getStatus() {
		return status;
	}
	public void setStatus(GhostStatus status) {
		this.status = status;
	}
	
	private int color;
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	
	public Ghost(int color) {
		this.color = color;
	}
}
