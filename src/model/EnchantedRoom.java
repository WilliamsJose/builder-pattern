package model;

import abstracts.AbstractRoomBuilder;

public class EnchantedRoom extends AbstractRoomBuilder {

	public void buildDescription() {
		room.setDescription("Fear Demon's room");
	}

	public void buildMeasuredArea() {
		room.setMeasuredArea(266.6);
	}

	public void buildtotalDoors() {
		room.setTotalDoors(1);
	}

	public void buildtotalWalls() {
		room.setTotalWalls(8);
	}

	public void buildCeiling() {
		room.setCeiling("Prickly");
	}

	public void buildFloor() {
		room.setFloor("Bloody");
	};
	
	public void buildEnchantment() {
		room.setEnchantment("Decreases all attributes by 70%");
	};
}
