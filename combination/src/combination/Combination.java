/*
     List all possible combinations of 2 numbers from the 5 numbers the user enters.
    ex) 
    when the 5 numbers are {1, 2, 3, 4, 5}
    Output will be  1 2, 1 3, 1 4, 1 5, 2 3, 2 4, 2 5, 3 4, 3 5, 4 5
 */
package combination;

import java.util.Scanner;

/**
 * Class exercise
 * @topic Array
 * @name Combination numbers
 * @date 03112015
 * @author Chohee Kim
 */

public class Combination {
    
    public static String FromInt (int i){
        
        switch(i) {
            
            case 1 : return "First";
            case 2 : return "Second";
            case 3 : return "Third";
            case 4 : return "Fourth"; 
            case 5 : return "Fifth";  
            default : return String.valueOf(i);    
        }
        
    }
    public static boolean NotDifferntFrom (int num1, int num2){
         
        if( num1 != num2) {
            
            return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.print("Enter 5 integer number ( 0 - 9) : ");
        
        //the unser enters five numbers 
        for(int i = 0 ; i < numbers.length ; i++){
                    
            numbers[i] = input.nextInt();
        }
        
        //Checking if there is duplicate

        for(int i = 0; i < numbers.length ; i++){
            for(int j = i + 1; j < numbers.length ; j++){
                if(NotDifferntFrom(numbers[i], numbers[j])){

                    System.out.printf("%s number must be different from %s number \n"
                    + "Please enter other number : ",FromInt(i + 1),FromInt(j + 1));
                    numbers[i] = input.nextInt(); 

                    i = -1;
                    break;
                }

            }

        }

        for(int i = 0 ; i < numbers.length ; i ++){
            
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();
        
        for(int i = 0 ; i < numbers.length ; i++){
           
            if(numbers[i] == 0) {
                
                for(int j = i + 1; j < numbers.length; j++){
                         
                    System.out.print(numbers[j]);
                    System.out.print(numbers[i] + " ");
                }
            }else{
                     
               for(int j = i + 1; j < numbers.length ; j++) {
                System.out.print(numbers[i] );  
                System.out.print(numbers[j] + " "); 
               }
            }
        
        }
        
    }
    
}
