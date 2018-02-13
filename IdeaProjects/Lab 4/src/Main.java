import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);
    long decimal = 0;

    System.out.println("Enter a hexadecimal number: ");
    String hexNum = scanner.next();
    hexNum = hexNum.toLowerCase();
    hexNum = hexNum.replace("0x", "");

    for (int n=0; n < hexNum.length(); n++) { /*(initialization; terminate when false; increment)*/
        char hexChar = hexNum.charAt(n);
        int charVal = 0;
        if (hexChar >= 48 && hexChar <= 57) {
            charVal = hexChar - 48;
        } else {
            charVal = hexChar - 87;
        }
        int exponent = hexNum.length() - n - 1;
        decimal = (long) (decimal + charVal * Math.pow(16, exponent));
    }

    System.out.println("Your number is " + decimal + " in decimal");


    }
}











