/*
    A program that presenting a total in dollars, quarters, dimes, nickles, and pennies
    in a given amount of money the user enters.
*/
package CountingMonetaryUnits;

import java.util.Scanner;

/**
 * Chapter 2
 * @topic Conditional Statement
 * @name Counting Monetary Units
 * @datek 02222015
 * @author Chohee Kim
 */

public class JavaApplication11 {

    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
       
       //receive the amount
       System.out.print("Enter the amount as a decimal number, .e.g.,11.56: ");
       double amount = input.nextDouble();
       
       int remainingAmount = (int)(amount * 100);
       
       //find the number of one dollars
       int dollar = remainingAmount / 100;
       remainingAmount = remainingAmount % 100;
       
       System.out.printf("%d \n",remainingAmount);
       
       //find the number of quarters in the remaining amount
       int quaters = remainingAmount / 25;
       remainingAmount = remainingAmount  % 25;
       
       System.out.printf("%d \n",remainingAmount);

       //find the number of dimes in the remaining amount       
       int dimes = remainingAmount / 10;
       remainingAmount = remainingAmount % 10;
       
       System.out.printf("%d \n",remainingAmount);

       //find the number of nickles in the remaining amount
       int nickles = remainingAmount / 5;
       remainingAmount = remainingAmount % 5;
       
       System.out.printf("%d \n",remainingAmount);
       
       //find the number of pennies
       int penny = remainingAmount;
       
       System.out.printf("Your amount : %.2f \n\nConsists of %d dollars \n"
               + "%d Quarters \n%d Dimes\n%d Nickles \n%d pennies", amount,dollar,quaters,
               dimes,nickles,penny);
       
       
        
       
       
       

                
        
        }
    }
    
