// DJ Trost | CSD405 | Assignment 2 | 20 August 2023
// Tests collection of Fans and a single instance of Fan

public class TestFan {
    public static void main(String[] args) {
        // Initialize a collection of Fans
        Fan[] fanObjects = new Fan[3];
        fanObjects[0] = new Fan();
        fanObjects[1] = new Fan(2, 10, "black");
        fanObjects[2] = new Fan(3, 25, "red");

        // Initialize single instance of a Fan
        Fan singleFan = new Fan(1, 15, "cyan");

        // Runs a for loop to iterate over fanObjects
        for (Fan f: fanObjects) {
            f.turnOn();
            System.out.print("This fan is ");
            f.printCollection(fanObjects);
            System.out.println();
        }

        System.out.println(); // Formatting

        // Prints info for singleFan
        System.out.print("The single instance is ");
        singleFan.printInstance(singleFan);
        System.out.println();
    }
}
