// *****************    *******************************************************************
//    Assignment1.java            Author:  Courtney Grillo
//
//    Simple program creates a string based on temperature and random factors
//*************************************************************************************

import java.util.Scanner;
import java.util.Random;
public class Assignment1
{
    //*********************************************************************************
    //  Prints initials in large block letters
    //*********************************************************************************
    public static void main(String[] args)
    {
        System.out.println("    CCCCCC              GGGGG    ");
        System.out.println("  CCC     CC          GG     GGG ");
        System.out.println("CC                  GG           ");
        System.out.println("CC                  GG           ");
        System.out.println("CC                  GG      GGGG ");
        System.out.println("CC                  GG         GG");
        System.out.println("CC                  GG         GG");
        System.out.println("  CCC     CC          GG     GGG ");
        System.out.println("    CCCCCC              GGGGGG   ");


        //*****************************************************************************
        //  Converts fahrenheit to celsius and saves celsius value
        //*****************************************************************************

        double fahrenheitValue;
        double celsiusValue;
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a temperature in Fahrenheit: ");
        fahrenheitValue = scan.nextDouble();

        celsiusValue = ((float)fahrenheitValue - 32) * 5/9;

        //****************************************************************************
        //  Saves user's string in reverse without first and last character
        //****************************************************************************

        String userInput;
        System.out.println("Please enter a five character long string:");
        userInput = scan.next();

        String mutation1;
        String mutation2;
        mutation1 = userInput.substring(1,4);
        mutation2 = new StringBuilder(mutation1).reverse().toString();

        //****************************************************************************
        //  Generates a random number
        //****************************************************************************

        Random generator = new Random();
        int number;

        number = generator.nextInt(16352) + 32;

        //****************************************************************************
        //  Combining mutatited string with random number
        //****************************************************************************

        System.out.println("Generating your new string ... ");
        System.out.println("Your new string is: " + celsiusValue + mutation2 + number);

    }
}
