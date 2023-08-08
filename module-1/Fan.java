// DJ Trost | CSD405 | Assignment 1 | 13 August 2023
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

    public void setSpeed(int newSpeed) {
        if(on == true) { // If the fan isn't "on" then the speed can't be changed
            speed = newSpeed;
        }
        else {
            System.out.println("The fan must be on to change the speed.");
        }
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
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
    Fan(int newSpeed, int newRadius, String newColor) {
        speed = newSpeed;
        radius = newRadius;
        color = newColor;
    }

    // Returns Fan's state as a String
    public String toString() {
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

        return power + ", is set to a speed of " + fanSpeed + ", has a radius of " + radius + ", and is the color " + color + "."; 
    }

}