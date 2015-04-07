
package atmmethod;

import java.util.Scanner;

/**
 * Class Assignment #9-1
 * @topic Method
 * @name ATM Method
 * @date 03302015
 * @author Chohee Kim
 */

public class ATMMethod {
    
    static int checking = 500;
    static int saving = 1000;
    static Scanner input = new Scanner(System.in);
    
    public static void mainMenu() {
        //Display main menu which consists of current balance and 3 possible transaction types.
        System.out.printf("Current checking balance : $ %d \nCurrent saving balance : $ %d\n",checking,saving);
        System.out.println("*Transaction typyes* \nc. Check balance \nd. Deposit \nw. Withdrawal");        
    }
    
    public static int checkingBalance(String opr) {  
        //Display the current balance of the appropriate account.
        if(opr.equals("S") || opr.equals("s")) {
            return saving;
        }else{
            return checking;
        }
    }
    
    public static int deposit(String opr){
        //ask the user for the amount to deposit and display updated the balance.
        System.out.println("How much would you like to deposit? ");
        int depositM = input.nextInt();
        
        if(opr.equals("S") || opr.equals("s")) {
            return saving + depositM;
        }else {
            return checking + depositM;
        }        
    }
    
    public static void withdraw(String opr) {
        //aks the user for the amount to withdraw.
        //the minimum balance is $10 for checking and $100 for saving. 
        //if withdrawal is allowed, display updated balance. if not, display an error message.
        System.out.println("How much would you like to withdraw? ");
        int withdrawM = input.nextInt();
        
        if(opr.equals("S") || opr.equals("s")){
            if(withdrawM < 100) {
                System.out.println("The minimum balance is $100. "); 
                
            }else {
                System.out.printf("Updated Saving Account : $%d \n", saving-withdrawM );
            }
        }else {
            if(withdrawM < 10) {
                System.out.println("The minimum balance is $10. ");                
            }else{ 
                System.out.printf("Updated Checking Account : $%d \n", checking-withdrawM );
            }
        }
    }
    public static void main(String[] args) {
              
        mainMenu();
        
        //ask the user for the account type on which s(he) wants to operate and the type of transaction they want.
        System.out.println("Which account would you like to operate?\nSavings(S) or Checking(C)");
        String operate = input.next();
        System.out.println("What type of transaction would you like to use?\n"
                + "c. Check balance \nd. Deposit \nw. Withdrawal");
        String transaction = input.next();
        
        switch(transaction) {
            
            case "c" :
                System.out.printf("Current Balance : $%d \n",checkingBalance(operate));
                break;
            case "d" :
                System.out.printf("Updated Account : $%d \n",deposit(operate));
                break;
            case "w" :
                withdraw(operate);
                break;               
        }
                

        
        
    }
    
}
