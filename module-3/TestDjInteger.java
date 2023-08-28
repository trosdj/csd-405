// DJ Trost | CSD405 | Assignment 3 | 27 August 2023
// Test code for DjInteger class

public class TestDjInteger {
    public static void main(String[] args) {
        // Set instances of DjInteger
        DjInteger dj1 = new DjInteger();
        DjInteger dj2 = new DjInteger(Integer.valueOf(13));
        DjInteger dj3 = new DjInteger(31);

        // Tests with dj1
        System.out.println(dj1.isEven());
        System.out.println(dj1.isOdd());
        System.out.println(dj1.isPrime());
        System.out.println(dj1.equals(800));

        System.out.println(" ");    // Used for formatting

        // Tests with dj2
        System.out.println(dj2.isEven());
        System.out.println(dj2.isOdd());
        System.out.println(dj2.isPrime());
        System.out.println(dj2.equals(Integer.valueOf(1428)));

        System.out.println(" ");

        // Tests with dj3
        System.out.println(dj3.isEven());
        System.out.println(dj3.isOdd());
        System.out.println(dj3.isPrime());
        System.out.println(dj3.equals(31));

        System.out.println(" ");
    }
}
