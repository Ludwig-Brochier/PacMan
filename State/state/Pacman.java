package state;

public class Pacman extends MobileElement {
	
	private PacmanStatus status;
	public PacmanStatus getStatus() {
		return status;
	}
	public void setStatus(PacmanStatus status) {
		this.status = status;
	}
}
