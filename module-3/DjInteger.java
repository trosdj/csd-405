// DJ Trost | CSD405 | Assignment 3 | 27 August 2023
// Initializes a class named DjInteger

public class DjInteger {
    private int dj = 13;

    // Setter and getter methods
    public void setDj(int dj) {
        this.dj = dj;
    }

    public int getDj() {
        return dj;
    }

    // Constructors

    DjInteger() {

    }

    DjInteger(int dj) {
        this.dj = dj;
    }

    // Non-static methods
    public boolean isEven() {
        if ((this.dj %2) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isOdd() {
        if((this.dj %2) != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPrime() {
        for (int i = 2; i < this.dj; i++) {
            if ((this.dj % i) == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int dj) {
        if (this.dj == dj) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean equals(Integer dj) {
        if (this.dj == dj) {
            return true;
        }
        else {
            return false;
        }
    }

    // Static methods using int
    public static boolean isEven(int dj) {
        if ((dj %2) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isOdd(int dj) {
        if ((dj %2) != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(int dj) {
        for (int i = 2; i < dj; i++) {
            if ((dj % i) == 0) {
                return false;
            }
        }

        return true;
    }

    // Static methods using Integer
    public static boolean isEven(Integer dj) {
        if ((dj %2) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isOdd(Integer dj) {
        if ((dj %2) != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(Integer dj) {
        for (int i = 2; i < dj; i++) {
            if ((dj % i) == 0) {
                return false;
            }
        }

        return true;
    }
}
