// DJ Trost | CSD405 | Assignment 1 | 13 August 2023
// Tests two instances of the Fan class

public class TestFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(2, 10, "black");

        // Before Setting new variables
        fan1.turnOn();
        System.out.println("Fan 1 is " + fan1.toString());

        fan2.turnOn(); // If the fan isn't "on" then the speed will always be "stopped"
        System.out.println("Fan 2 is " + fan2.toString());

        // Tests setter methods
        fan1.setColor("Red");
        fan2.setSpeed(3);

        // Tests the getter methods
        System.out.println(fan1.getColor());
        System.out.println(fan1.getRadius());
        System.out.println(fan2.getPower());
        System.out.println(fan2.getSpeed());

        // After testing setters
        System.out.println("Fan 1 is " + fan1.toString());

        System.out.println("Fan 2 is " + fan2.toString());
    }
}
