package state;

public abstract class MobileElement {
	
	protected Direction direction;
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	protected int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	protected int position;
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
	protected int statusTime;
	public int getStatusTime() {
		return statusTime;
	}
	public void setStatusTime(int statusTime) {
		this.statusTime = statusTime;
	}
	
	protected int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	protected int y;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
