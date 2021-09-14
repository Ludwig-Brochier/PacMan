package state;

public class Space extends StaticElement {
	
	private SpaceTypeId spaceTypeId;
	public SpaceTypeId getSpaceTypeId() {
		return spaceTypeId;
	}
	public void setSpaceTypeId(SpaceTypeId spaceTypeId) {
		this.spaceTypeId = spaceTypeId;
	}
	
	public Space(SpaceTypeId id) {
		this.spaceTypeId = id;
	}
}
