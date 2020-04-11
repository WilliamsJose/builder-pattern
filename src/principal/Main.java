package principal;

import model.EnchantedRoom;
import model.MazeGame;
import model.NormalRoom;
import model.Room;

public class Main {

	public static void main(String[] args) {
		MazeGame mg = new MazeGame(new NormalRoom());
		mg.BuildMaze();
		
		Room room = mg.getRoom();

		System.out.println("Description: " + room.getDescription()
		+ "\nMeasured Area: " + room.getMeasuredArea()
		+ "\nTotal Doors: " + room.getTotalDoors()
		+ "\nTotal Walls: " + room.getTotalWalls()
		+ "\nCeiling: " + room.getCeiling()
		+ "\nFloor: " + room.getFloor()
		+ "\nEnchantment: " + room.getEnchantment());
		
		// Maaaaagic!!!
		mg = new MazeGame(new EnchantedRoom());
		mg.BuildMaze();
		
		room = mg.getRoom();
		System.out.println("\n\nDescription: " + room.getDescription()
		+ "\nMeasured Area: " + room.getMeasuredArea()
		+ "\nTotal Doors: " + room.getTotalDoors()
		+ "\nTotal Walls: " + room.getTotalWalls()
		+ "\nCeiling: " + room.getCeiling()
		+ "\nFloor: " + room.getFloor()
		+ "\nEnchantment: " + room.getEnchantment());
	}

}
