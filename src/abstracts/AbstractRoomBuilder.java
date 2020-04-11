package abstracts;

import model.Room;

public abstract class AbstractRoomBuilder {
	protected Room room;
		
	public AbstractRoomBuilder() {
		room = new Room();
	}
	
	public abstract void buildDescription();
	public abstract void buildMeasuredArea();
	public abstract void buildtotalDoors();
	public abstract void buildtotalWalls();
	public abstract void buildCeiling();
	public abstract void buildFloor();
	public abstract void buildEnchantment();
	
	public Room getRoom() {
		return room;
	}
	
}
