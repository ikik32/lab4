import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Blackjack
{

    public static void main (String[] args) {

        P1Random rng = new P1Random();
        Scanner scnr = new Scanner(System.in);
        int numGames = 0;
        int myHand = 0;
        int dealHand = 0;
        int myWins = 0;
        int dealWins = 0;
        int numTies = 0;

        while (numGames >= 0) {

            System.out.println("START GAME #" + (numGames + 1));
            int myCard = rng.nextInt(13) + 1;
            System.out.print("\nYour card is a ");
            if (myCard == 1) {
                System.out.println("ACE!");
            } else if (myCard == 11) {
                System.out.println("JACK!");
            } else if (myCard == 12) {
                System.out.println("QUEEN!");
            } else if (myCard == 13) {
                System.out.println("KING!");
            } else System.out.println(myCard + "!");
            if (myCard == 11 || myCard== 12 || myCard== 13)
            {myCard = 10;
            }
            else myCard = myCard;
            myHand = myHand + myCard;
            System.out.println("Your hand is: " + (myHand));

            while (myHand > 0 && dealHand >= 0) {
                System.out.println("\n1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");
                System.out.print("\nChoose an option: ");
                int choice = scnr.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("\nYour card is a ");
                        myCard = rng.nextInt(13) + 1;
                        if (myCard == 1) {
                            System.out.println("ACE!");
                        } else if (myCard == 11) {
                            System.out.println("JACK!");
                        } else if (myCard == 12) {
                            System.out.println("QUEEN!");
                        } else if (myCard == 13) {
                            System.out.println("KING!");
                        } else System.out.println(myCard + "!");
                        if (myCard == 11 || myCard == 12 || myCard == 13)
                        {myCard = 10;
                        }
                        else myCard = myCard;
                        myHand = myHand + myCard;
                        System.out.println("Your hand is: " + (myHand));
                        break;

                    case 2:
                        int dealCard = rng.nextInt(11) + 16;
                        dealHand = dealCard;
                        System.out.println("\nDealer's hand: " + dealHand);
                        System.out.println("Your hand is: " + myHand);
                        break;

                    case 3:
                        System.out.println("\nNumber of Player wins: " + myWins);
                        System.out.println("Number of Dealer wins: " + dealWins);
                        System.out.println("Number of tie games: " + numTies);
                        System.out.println("Total # of games played is: " + (numGames));
                        System.out.println("Percentage of Player wins: " + (1.0*myWins/(numGames))*100 + "%");
                        break;

                    case 4:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\nInvalid input!\n" + "Please enter an integer value between 1 and 4.");


                }


                if (dealHand > 21) {
                    myWins = myWins + 1;
                    myHand = 0;
                    dealHand = 0;
                    numGames = numGames + 1;
                    System.out.println("\nYou win!\n");
                } else if (myHand > 21) {
                    System.out.println("\nYou exceeded 21! You lose.\n");
                    dealWins = dealWins + 1;
                    myHand = 0;
                    dealHand = 0;
                    numGames = numGames + 1;
                } else if (myHand == 21) {
                    System.out.println("\nBLACKJACK! You win!\n");
                    myWins = myWins + 1;
                    myHand = 0;
                    dealHand = 0;
                    numGames = numGames + 1;
                } else if (dealHand == 21 || dealHand > myHand) {
                    System.out.println("\nDealer wins!\n");
                    dealWins = dealWins + 1;
                    myHand = 0;
                    dealHand = 0;
                    numGames = numGames + 1;
                } else if ((myHand==dealHand) && dealHand>0) {
                    System.out.println("\nIt's a tie! No one wins!\n");
                    numTies = numTies + 1;
                    myHand = 0;
                    dealHand = 0;
                    numGames = numGames + 1;

                }


            }
        }

    }
}

















