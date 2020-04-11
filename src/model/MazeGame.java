package model;

import abstracts.AbstractRoomBuilder;

public class MazeGame {
	protected AbstractRoomBuilder room;
	
	public MazeGame() {};
	
	public MazeGame(AbstractRoomBuilder room) {
		this.room = room;
	}
	
	public void BuildMaze() {
		room.buildDescription();
		room.buildMeasuredArea();
		room.buildtotalWalls();
		room.buildCeiling();
		room.buildtotalDoors();
		room.buildFloor();
		room.buildEnchantment();
	}
	
	public Room getRoom() {
		return room.getRoom();
	}

}
