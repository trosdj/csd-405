// DJ Trost | CSD405 | Assignment 2 | 20 August 2023
// Initializes a class named Fan

public class Fan {
    // Sets the constants for the four speeds  
    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    // Sets defaults for Fan's variables
    private int speed = STOPPED;
    private Boolean on = false;
    private int radius = 6;
    private String color = "white";

    // Setters
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setSpeed(int speed) {
        if(on == true) { // If the fan isn't "on" then the speed can't be changed
            this.speed = speed;
        }
        else {
            System.out.println("The fan must be on to change the speed.");
        }
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getters
    public Boolean getPower() {
        return on;
    }

    public int getSpeed() {
        return speed;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // no-arg constructor
    Fan() {

    }

    // constructor taking arg
    Fan(int speed, int radius, String color) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    // Method to print the information for a collection of objects
    public void printCollection (Fan [] array) {
        String power;
        String fanSpeed;

        if(on == true) {
            power = "on";
        }
        else {
            power = "off";
        }
        
        // If the fan isn't "on" then the speed will always be "stopped"
        if(speed == 1 && on == true) {
            fanSpeed = "slow";
        }
        else if(speed == 2 && on == true) {
            fanSpeed = "medium";
        }
        else if(speed == 3 && on == true) {
            fanSpeed = "fast";
        }
        else {
            fanSpeed = "stopped";
        }

        System.out.print(power + ", is set to a speed of " + fanSpeed + ", has a radius of " + radius + ", and is the color " + color + "."); 
    }

    // Method to print the informtation for a single instance
    public void printInstance (Fan instance) {
        String power;
        String fanSpeed;

        if(on == true) {
            power = "on";
        }
        else {
            power = "off";
        }
        
        // If the fan isn't "on" then the speed will always be "stopped"
        if(speed == 1 && on == true) {
            fanSpeed = "slow";
        }
        else if(speed == 2 && on == true) {
            fanSpeed = "medium";
        }
        else if(speed == 3 && on == true) {
            fanSpeed = "fast";
        }
        else {
            fanSpeed = "stopped";
        }

        System.out.print(power + ", is set to a speed of " + fanSpeed + ", has a radius of " + radius + ", and is the color " + color + "."); 
    }
}