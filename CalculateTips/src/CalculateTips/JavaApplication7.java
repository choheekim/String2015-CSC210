/*
    A program that reads the subtotal and the gratuity rate, 
    then computes the gratutiy and total.
*/
package CalculateTips;

import java.util.Scanner;

/**
 * Chapter 2
 * @topic Datatype
 * @name Financial Application : calculate tips
 * @datek 03022015
 * @author Chohee Kim
 */

public class JavaApplication7 {


    public static void main(String[] args) {
        
        final double pie = 3.14;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratuity rate : ");
        int subtotal = input.nextInt();
        int gratuityRate = input.nextInt();
        
        double gratuity = (double)subtotal * ((double)gratuityRate*0.01);
        double total = subtotal + gratuity;
        
        System.out.printf("The gratutity is $ %.2f and total is $ %.2f",
                gratuity,total);
        
        
      
      }
    }
    

    

