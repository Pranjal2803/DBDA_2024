import java.util.Scanner;

public class Player {
    String name;
    int age;
    String cname;
    int run;
    
    // Constructor to initialize player details
    public Player(String name, int age, String cname, int run) {
        this.name = name;
        this.age = age;
        this.cname = cname;
        this.run = run;
    }
    
    // Method to read player details from user input
    public void readPlayerDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Player Name");
        name = sc.next();
        
        System.out.println("Enter Player Age ");
        age = sc.nextInt();
        
        System.out.println("Enter Country Name");
        cname = sc.next();
        
        System.out.println("Enter Total Run");
        run = sc.nextInt();
    }
    
    // Method to display player details
    public void disPlayer() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country Name: " + cname);
        System.out.println("Total Run: " + run);
    }
    
    public static void main(String[] args) {
        // Create instances of Player class with predefined details
        Player p1 = new Player("Dhoni", 45, "India", 9000);
        Player p2 = new Player("Virat", 40, "India", 100000);
        Player p3 = new Player("Sachin", 55, "India", 8000);
        Player p4 = new Player("Rohit", 35, "India", 6000);
        Player p5 = new Player("Shubhman", 28, "India", 1000);
        
        // Display details of each player
        p1.disPlayer();
        p2.disPlayer();
        p3.disPlayer();
        p4.disPlayer();
        p5.disPlayer();
        
        // Display players having more than 5000 runs
        System.out.println("Players having more than 5000 runs:");
        for (Player player : new Player[] { p1, p2, p3, p4, p5 }) {
            if (player.run > 5000) {
                player.disPlayer();
            }
        }
    }
}

