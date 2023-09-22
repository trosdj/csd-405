// DJ Trost | CSD405 | Assignment 5.1
// Prints an ArrayList of 10 strings and prompts a user to choose one

import java.util.ArrayList;
import java.util.Scanner;

public class StringList {
    // Method to choose the string or throw and Exception
    public static String chooseString(ArrayList<String> list, String input) {
        if (list.contains(input)) {
            return input;
        }
        else {
            throw new IllegalArgumentException("Input Out of Bounds");
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ArrayList<String> stringList = new ArrayList<>();
            stringList.add("ghost");
            stringList.add("zombie");
            stringList.add("dragon");
            stringList.add("gnome");
            stringList.add("doctor");
            stringList.add("skeleton");
            stringList.add("witch");
            stringList.add("vampire");
            stringList.add("alien");
            stringList.add("robot");

        System.out.println("Available Halloween Costumes:\n");
        // Prints items on a new line
        for (String costume: stringList) {
            System.out.println(costume);
        }

        System.out.println("");     // Formatting

        try {       // If user chooses an item from the list this runs
            System.out.println("Choose which costume you'd like from the list:");
            String chosenString = input.nextLine().toLowerCase();
            System.out.println("\nYou chose the " + chooseString(stringList, chosenString) + 
            "! Congratulations!");

        } catch (IllegalArgumentException e) {      // If user chooses an item not from the list this runs
            System.out.println("\nException: Input Out of Bounds");
        }
    }
}
