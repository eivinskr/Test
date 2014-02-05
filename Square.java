package Sokoban;

public class Square {
	private static String wall = "#";
	private static String emptySquare = " ";
	private static String targetSquare = ".";
	private static String box = "$"; // '*' box on targetsquare
	private static String boxOnTarget = "*";
	private static String player = "@";
	
	public static String getWall() {
		return wall;
	}
	public static String getEmptySquare() {
		return emptySquare;
	}
	public static String getTargetSquare() {
		return targetSquare;
	}
	public static String getBox() {
		return box;
	}
	public void setBox(String box) {
		Square.box = box;
	}
	public static String getPlayer() {
		return player;
	}
	public static String getBoxOnTarget() {
		return boxOnTarget;
	}
	
	
	

	
}
