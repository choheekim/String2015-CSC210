/*
    This is a program to reverse nd print an array
*/
package reverseArray;

import java.util.Scanner;

/**
 * Practice
 * @topic Array
 * @name Reverse Array
 * @date 03112015
 * @author Chohee Kim
 */
public class reverseArray {


    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);   
        int[] arr = new int[5];
        int temp;
        
        System.out.print("Enter fiver numbers :");  
        
        for(int i = 0; i < arr.length; i++){
            

            arr[i] = input.nextInt();
            
        }
        

        
        for(int i = 0; i < arr.length/2; i++){
            temp = arr[i];            
            arr[i] = arr[(arr.length - i) - 1];
            arr[(arr.length - i) - 1] = temp;
            
        }
        
        for(int i = 0; i<arr.length ; i++){
            
            System.out.print(arr[i] + " ");
        }
               
    }   
    
}
