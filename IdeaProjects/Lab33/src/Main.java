import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        int mpg = scnr.nextInt();
        if (mpg > 0) {
            mpg = mpg;
            }
        else {System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        System.exit(0);}

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        double tankCap = scnr.nextDouble();
        if (tankCap > 0) {
            tankCap = tankCap;
        }
        else {System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
        System.exit(0);}


        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        double tankPer = scnr.nextDouble();
        if (tankPer >= 0 && tankPer <= 100)
        {
            tankPer = tankPer;
        }
        else
            {System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
             System.exit(0);
            }


        double rawRange = 0;
        rawRange = mpg * tankCap * (tankPer * 0.01);

        if (rawRange <= 25)
        {
            rawRange = Math.floor(rawRange);
            System.out.print("Attention! Your current estimated range is running low: " + (int)rawRange + " miles left!!!");
            }
        else
        {
            System.out.print("Keep driving! Your current estimated range is: " + (int)rawRange + " miles!");
        System.exit(0);
        }














    }





}