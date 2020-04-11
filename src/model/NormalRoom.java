package model;

import abstracts.AbstractRoomBuilder;

public class NormalRoom extends AbstractRoomBuilder {

	public void buildDescription() {
		room.setDescription("Renegade Knight's room");
	}

	public void buildMeasuredArea() {
		room.setMeasuredArea(166.6);
	}

	public void buildtotalDoors() {
		room.setTotalDoors(3);
	}

	public void buildtotalWalls() {
		room.setTotalWalls(5);
	}

	public void buildCeiling() {
		room.setCeiling("Black");
	}

	public void buildFloor() {
		room.setFloor("Concrete");
	};
	
	public void buildEnchantment() {
		room.setEnchantment("This is a normal room.");
	};
	
}
