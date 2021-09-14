package state;

public class Wall extends StaticElement {
	
	private WallTypeId wallTypeId;
	public WallTypeId getWallTypeId() {
		return wallTypeId;
	}
	public void setWallTypeId(WallTypeId wallTypeId) {
		this.wallTypeId = wallTypeId;
	}
	
	public Wall(WallTypeId id) {
		this.wallTypeId = id;
	}
}
