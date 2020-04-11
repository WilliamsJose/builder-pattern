package model;

public class Room {
	private String description;
	private double measuredArea;
	private int totalDoors;
	private int totalWalls;
	private String ceiling;
	private String floor;
	private String enchantment;
	
	public Room() {}

	public Room(String description, double measuredArea, int totalDoors, int totalWalls, String ceiling, String floor, String enchantment) {
		super();
		this.description = description;
		this.measuredArea = measuredArea;
		this.totalDoors = totalDoors;
		this.totalWalls = totalWalls;
		this.ceiling = ceiling;
		this.floor = floor;
		this.enchantment = enchantment;
	}

	public String getDescription() {
		return description;
	}

	public double getMeasuredArea() {
		return measuredArea;
	}

	public int getTotalDoors() {
		return totalDoors;
	}

	public int getTotalWalls() {
		return totalWalls;
	}

	public String getCeiling() {
		return ceiling;
	}

	public String getFloor() {
		return floor;
	}
	
	public String getEnchantment() {
		return enchantment;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMeasuredArea(double measuredArea) {
		this.measuredArea = measuredArea;
	}

	public void setTotalDoors(int totalDoors) {
		this.totalDoors = totalDoors;
	}

	public void setTotalWalls(int totalWalls) {
		this.totalWalls = totalWalls;
	}

	public void setCeiling(String ceiling) {
		this.ceiling = ceiling;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	public void setEnchantment(String enchantment) {
		this.enchantment = enchantment;
	}

}
