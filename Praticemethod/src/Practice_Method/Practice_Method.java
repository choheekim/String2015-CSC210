
package Practice_Method;

import java.util.Scanner;

/**
 * Practice
 * @topic Method
 * @name My first use method
 * @datek 03072015
 * @author Chohee Kim
 */
public class Practice_Method {

    public static int timesNum (int num1, int num2){
        
        int result = num1 * num2;
        return result;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer numbers to multiply : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
   
        System.out.printf("%d x %d = %d \n",num1,num2,timesNum(num1,num2));   
    
        }
        
    }
    

