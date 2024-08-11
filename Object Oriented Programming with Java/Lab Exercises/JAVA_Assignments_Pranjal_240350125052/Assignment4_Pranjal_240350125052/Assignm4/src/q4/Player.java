package q4;
////Defines a package named q4
public class Player {
	//Defines a class named Player.
	String player_name;
	// Declares a variable to store the player's name
	int total_run;
	// Declares a variable to store the total runs scored by the player.
	int no_of_wickets;
	// Declares a variable to store the number of wickets taken by the player.
	int no_of_matches;
	// Declares a variable to store the number of matches played by the player.
	String country;
	// Declares a variable to store the country of the player.
	int no_of_century;
	// Declares a variable to store the number of centuries scored by the player.
	String category = null;
	// Declares a variable to store the category of the player, initialized to null.
	public Player(String player_name, int total_run, int no_of_wickets, int no_of_matches, String country,
			int no_of_century, String category) {
		//This is a Constructor method for the `Player` class, initializes the player's attributes.
		this.player_name = player_name;
		// Assigns the player's name local variable passed as parameter to the instance variable.
		this.total_run = total_run;
		// Assigns the total runs local variable  passed as parameter to the instance variable.
		this.no_of_wickets = no_of_wickets;
		// Assigns the number of wickets  local variable  passed as parameter to the instance variable.
		this.no_of_matches = no_of_matches;
		// Assigns the number of matches  local variable   passed as parameter to the instance variable
		this.country = country;
		// Assigns the country local variable passed as parameter to the instance variable.
		this.no_of_century = no_of_century;
		// Assigns the number of centuries  local variable passed as parameter to the instance variable.
		this.category = category;
		// Assigns the category  local variable passed as parameter to the instance variable.
	}
	
	public void dispPlayer() {
		// Method to display player details.
		System.out.println(player_name+ " "+total_run+" "+no_of_wickets+ " "+no_of_matches+" "+country+" "+no_of_century+" "+category+" ");
		// Prints the player's name, total runs, wickets, matches played, country, number of centuries, and category.
	}

}
