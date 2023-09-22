// DJ Trost | CSD405 | Assignment 5.2
// Generates 10 random numbers and appends them to the file data.file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberFile {
    // Method to generate a random int from 1 - 10
    public static int generateNumber() {
        int number = (int)((Math.random() * 10) + 1);
        return number;
    }

    // Method to place generated ints into a String
    public static StringBuilder getNumberString() {     
        StringBuilder newLine = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            newLine.append(generateNumber() + " ");
        }

        return newLine;
    }

    // Adds String with random ints to a file
    public static void appendFile(File file) throws IOException{
        FileWriter fw = new FileWriter(file, true);

        fw.append(getNumberString());

        fw.close();
    }

    // Method to print contents of a file
    public static void readFile(File file) throws IOException{
        Scanner input = new Scanner(file);

        while (input.hasNext()) {   // Goes one int at a time
            String number = input.next();
            System.out.print(number + " ");
        }

        input.close();
    }

    public static void main(String[] args) throws Exception{
        File file = new File("data.file");  // Opens data.file

        appendFile(file);   // Adds String to data.file
        readFile(file);     // Prints data.file
    }
}
