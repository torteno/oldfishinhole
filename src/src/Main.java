//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // imports the java Scanner to be utilized in the code



public class Main { // creates a public class with the name "Main"
    public static void main(String[] args) { // creates the main method that is run when the program starts

        Scanner scan = new Scanner(System.in); // creates a new scanner to detect inputs from DMOJ/the user

        int trout = scan.nextInt(); // declares and initializes the integer variable "trout" with the first number input
        int pike = scan.nextInt(); // declares and initializes the integer variable "pike" with the first number input
        int pickerel = scan.nextInt(); // declares and initializes the integer variable "pickerel" with the first number input
        int total = scan.nextInt(); // declares and initialize the integer variable "trout" with the first number input
        int maxtrout = total / trout; // declares and initialize the integer variable "maxtrout" with the value of total divided by trout. Used to get the maximum amount of trout that can be caught without going over the limit. 
        int maxpike = total / pike; // declares and initializes the integer variable "maxpike" with the value of total divided by pike. Used to get the maximum amount of pike that can be caught without going over the limit. 
        int maxpickerel = total / pickerel; // declares and initializes the integer variable "maxpickerel" with the value of total divided by pickerel. Used to get the maximum amount of pickerel that can be caught without going over the limit. 
        int count = 0; // declares and initializes the integer variable count with a value of 0. Used to count the number of correct solutions that are possible. 

        for (int i = 0; i <= maxtrout; i++) { // Creates a for loop that increases in value every single time the contents inside of the loop have been run through, and stops once it reaches the value of maxtrout. This line of code creates an integer variable of "i" that starts at 0 which keeps track of the number of trout.   
            for (int j = 0; j <= maxpike; j++) { // Creates a for loop that increases in value every single time the contents inside of the loop have been run through, and stops once it reaches the value of maxpike. This line of code creates an integer variable of "j" that starts at 0 which keeps track of the number of pike. 
                for (int k = 0; k <= maxpickerel; k++) { // Creates a for loop that increases in value every single time the contents inside of the loop have been run through, and stops once it reaches the value of maxpickerel. This line of code creates an integer variable of "k" that starts at 0 which keeps track of the number of pickerel. 
                    if (i + j + k > 0 && i * trout + j * pike + k * pickerel <= total) { // this if statement uses 2 boolean statements to verify that there is at least one fish being caught and that the total points of trout, pike, and pickerel caught is less or equal to the total number that was initially given. 
                        System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " Yellow Pickerel"); // This line prints to the terminal the number of trout followed Brown Trout, and it does the same for Northern Pike and Yellow Pickerel. 
                        count++; // increments the variable total by one to show another solution has been found, and will keep track of it to show how many there were at the end. 
                    } // bracket to close the if statement
                } // bracket to close the for loop
            } // bracket to close the for loop
        } // bracket to close the for loop


    System.out.println("Number of ways to catch fish: " + count); // prints out "Number of ways to catch fish: " with the value of count next to it, used to show how many different combinations there are of catching fish that doesn't go over the limit
    } // closed main method
} // closes main class
