// DJ Trost | CSD405 | Assignment 4
// Tests and initiates a method to find the maximum int in an ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class DjArrayListTest {
    public static void main(String[] args) {
        // Prebuilt ArrayList to test max
        ArrayList<Integer> testList = new ArrayList<Integer>();
            testList.add(13);
            testList.add(31);
            testList.add(151);

        System.out.println("The Test ArrayList is " + testList.toString());
        System.out.println("The max item is " + max(testList));

        System.out.println("");     // For formatting
        
        // Accepts User Input to test max
        System.out.println("Input Integers (End input with 0)");
        Scanner input = new Scanner(System.in);
        int NewInt = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(NewInt);       // Adds initial input into list

        while (NewInt != 0) {       // Stops input when the user inputs 0
            NewInt = input.nextInt();
            list.add(NewInt);
        }

        System.out.println("");      // For formatting

        System.out.println("The ArrayList you entered is " + list.toString());
        System.out.println("The max item is " + max(list));
    }

    public static Integer max (ArrayList<Integer> list) {
        int maximum = list.get(0);

        if (list.isEmpty()) {       // If the ArrayList is empty it will return 0
            maximum = 0;
        }
        else {
            for (int i =1; i < list.size(); i++) {
                if (maximum < list.get(i)) {
                    maximum = list.get(i);
                }
            }
        }

        return maximum;
    }
    
}