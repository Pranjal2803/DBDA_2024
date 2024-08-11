package q4;
//Declares a package named `q4
import java.util.ArrayList;
//Imports the ArrayList class from java.util package.
public class Player_ArrayListMain {
// Declares a public class named `Player_ArrayListMain`.
	public static void main(String[] args) {
    // This is the main method, the entry point of the program.
		int max_runs = 0;
		// Declares a variable to store the maximum runs.
		int runs;
		// Declares a variable to store the runs of each player.
		int ind = 0;
		// Declares a variable to store the index of the player with less than 100 runs.
		Player P1 = new Player("Pranjal",250, 250, 400, "India",10, "A");
		// Creates a Player object named P1 with the specified details.
		Player P2 = new Player("Pranjal1", 70, 60, 20, "India", 9, "A");
		// Creates a Player object named P2 with the specified details.
		Player P3 = new Player("Pranjal2", 500, 8, 62, "India", 8, "A");
		// Creates a Player object named P3 with the specified details.
		Player P4 = new Player("Pranjal3", 620, 150, 300, "India", 10, "A");
		// Creates a Player object named P4 with the specified details.
		Player P5 = new Player("Pranjal4", 400, 250, 20, "India", 10, "A");
		// Creates a Player object named P5 with the specified details.
		ArrayList<Player> PAL = new ArrayList<>();
		// Creates an ArrayList to store Player objects.
		PAL.add(P1);
		// Adds Player object P1 to the ArrayList.
		PAL.add(P2);
		// Adds Player object P2 to the ArrayList.
		PAL.add(P3);
		// Adds Player object P3 to the ArrayList.
		PAL.add(P4);
		// Adds Player object P4 to the ArrayList.
		PAL.add(P5);
		// Adds Player object P5 to the ArrayList.
		
		for(Player p:PAL) {
			// Displaying all player objects in the array list.
			p.dispPlayer();
			// Calls the dispPlayer method to display player details.
		}
		
	
		for(Player r :PAL) {
		//Displaying highest run scorer name
			runs = r.total_run;	
			// Retrieves the total runs of each player.
			int R = PAL.indexOf(r);
			//Retrieves of index of r object and stores in varaible R
			if(runs > max_runs) {
				// Checks if the runs are greater than the maximum runs.
				max_runs = runs;
				// Updates the maximum runs
				
		}
			
			
			
		}
		
		for(Player pp:PAL) {
		//Iterates in arraylist using for-each loop
			if(pp.total_run == max_runs) {
				// Finds the player with the maximum runs
				System.out.println("Highest run score player name: "+pp.player_name);
				// Prints the highest run scorer's name.
			}
		}
		
		
		for(Player pp: PAL) {
			//Remove the player who scored less than 100 runs using for-each loop
			if(pp.total_run < 100) {
				// Checks if the player's total runs are less than 100
				 ind = PAL.indexOf(pp);
				// Stores the index of the player.
				
			}
		}PAL.remove(ind);
		// Removes the player with less than 100 runs from the ArrayList
		for(Player p:PAL) {
			//using for-each loop to iterate in arraylist
			p.dispPlayer();
			// Displays the updated player list.
		}
		
		
		//Update the player with 10 century  else category B
		
		for(Player p: PAL) {
			//iterating in the arraylist using for-each loop
			if(p.no_of_century < 10) {
				// Checks if the player has less than 10 centuries
				p.category = "B";
				// Changes the player's category to B
			}
		}
		for(Player p:PAL) {
			//iterating in the arraylist using for-each loop
			p.dispPlayer();
			// Displays the updated player list
		}
		
	}

}
