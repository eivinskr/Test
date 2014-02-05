package Sokoban;

import java.util.ArrayList;

public class Board {
	
	private ArrayList<ArrayList<String>> board;
	private int size;
	private String printBoard = "";
	
	public Board(int size){
		this.size = size;
		ArrayList<ArrayList<String>> doubleArray = new ArrayList<ArrayList<String>>();
		this.board = doubleArray;
		board.add(new ArrayList<String>());
		for (int i = 0; i<size;i++){
			board.get(0).add(Square.getWall());
		}
		for (int i = 1; i<size-1;i++){
			board.add(new ArrayList<String>());
			board.get(i).add(Square.getWall());
			for (int j = 0; j<size-2;j++){
				board.get(i).add(Square.getEmptySquare());
			}
			board.get(i).add(Square.getWall());
		}
		board.add(new ArrayList<String>());
		for (int i = 0; i<size;i++){
			board.get(size-1).add(Square.getWall());
		}
		setBoard();
		
	}
	public ArrayList<ArrayList<String>> getBoard(){
		return board;
	}
	
	public int ledigeRuter(){
		int lengde = size-4;
		return (int) Math.pow(lengde, 2);
	}
	
	public void setBoard(){
		int numberOfPossibleSquares = (int) (Math.round(ledigeRuter()/2));
		while (numberOfPossibleSquares!=0){
			int arrayArray = (int) Math.round(Math.random()*(size-4)+2);
			if (arrayArray>2 && arrayArray<size-2){
				int arrayIndex = (int) Math.round(Math.random()*(size-4)+2);
				if (arrayIndex>2 && arrayIndex<size-2){
					if ((Square.getEmptySquare() == board.get(arrayArray).get(arrayIndex))
							&& ((Square.getEmptySquare() == board.get(arrayArray-1).get(arrayIndex))
							|| (Square.getEmptySquare() == board.get(arrayArray+1).get(arrayIndex))
							|| (Square.getEmptySquare() == board.get(arrayArray).get(arrayIndex-1))
							|| (Square.getEmptySquare() == board.get(arrayArray).get(arrayIndex+1)))){
						board.get(arrayArray).set(arrayIndex, Square.getBox());
						numberOfPossibleSquares--;
					}
				}
			}
		}
		
		
		
	}
	
	public String toString(){
		for (ArrayList<String> a:board){
			for (int i = 0; i<size;i++){
				String s = (String) a.get(i);
				printBoard += s;
			}
			printBoard += "\r\n";
		}
		return printBoard;
	}
	
}
