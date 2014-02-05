package Sokoban;

import java.util.Arrays;
import java.util.Scanner;

public class Sokoban {
	Sokoban sokoban;
	Board board;
	
		public void init(){
			board = new Board(8);
		}
		
		public void run() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Hvor stort brett (f. eks 8 for 8X8) ønsker du å spille med? ");
			if (scanner.hasNextInt()){
				int nextInt = scanner.nextInt();
				if (nextInt>5 && nextInt<101)
					board = new Board(nextInt);
				else
					throw new IllegalArgumentException("Du må skrive inn et heltall større enn 5, og mindre enn 101");
			}else {
				throw new IllegalArgumentException("Du må skrive inn et heltall større enn 5, og mindre enn 101");
			}
			System.out.println(board);
			System.out.println(board.ledigeRuter());
			
		
			
			
		}
		
		public static void main(String[] args) {
			Sokoban sokoban = new Sokoban();
			sokoban.run();
		}
}
