/* 
    An interactive Java program for a BMI(Body Mass Index)calculator.

*/

package bmicalculator;

import java.util.Scanner;


/**
 * Class Assignment
 * @topic Datatype
 * @name BMI Calculator_CSC210 Assignment #4
 * @date 02132015
 * @author Chohee Kim
 */

public class BMICalculator {

    //This is a program to calculate BMI
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        //Declare a new scanner
        
        System.out.print("Enter your first name and last name \nFirst name : ");
        String firstName = input.nextLine();
        System.out.print("Late name : ");
        String lastName = input.nextLine();
        //A user provibes his first name and last name.
        
        System.out.print("Enter your heigh in feet and inches :");
        double feet = input.nextDouble();
        double inches = input.nextDouble();
        //A user provibes his heihgh in feet and inches.
        
        System.out.print("Enter your weight in pounds(lb) : ");
        double weight = input.nextDouble();
        //A user provibes his weight.
        
        double height = 12 * feet + inches;
        //convert from height in feet-and-inches to inches
        
        double BMI = (703*weight)/(height*height);
        //declare a fomula for BMI.
        
        System.out.printf("\n\nName : %s %s \n",firstName,lastName);
        System.out.printf("Hight : %.2f ft, %.2f in = %.2f in \n",feet,inches,height);
        System.out.printf("Weight : %.2f \n",weight);
        System.out.printf("BMI : %.2f \n\n",BMI);
        //print out input imformation of the user
        
        if(BMI <= 18.5)  { 
        
            System.out.println("Underweight"); 
        }else if(BMI <= 24.9){ 
        
            System.out.println("Normal weight");
        }else if(BMI <= 29.9){
        
            System.out.println("Overweight");
        }else {
        
            System.out.println("Obesity");
        }
        
        
        
        
    }
    
}
