/*
 A program that reads in investment amount, annual interest rate, and number of years,
 and displays the future investment value.
 */
package financial_application;

import java.util.Scanner;

/**
 * Chapter 2
 * @topic Datatype
 * @name Financial application : calculate future investment value
 * @datek 02282015
 * @author Chohee Kim
 */

public class Financial_application {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter investment amount : ");
        double investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage : ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter number of years : ");
        int years = input.nextInt();
        
        double monthlyInterestRate = annualInterestRate / 1200;
        
        double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
        
        System.out.printf("Accumulated value is $%.2f \n\n",futureInvestmentValue);
        
        
    }
    
}
