/*
    It is a simple interface ATM program for the Gator Bank (using only switch conditional statement).
    There are three possible transactions types 
    1) Check balance (c) - Display the current balance of the approciate account.
    2) Deposit (d) - Ask the user for the amount (s)he wants to deposit, and then
                    update the balance of the appropriate account and display the new balance.
    3) Withdraw (w)- Ask the user for the amount (s)he wants to withdraw. Then use the following rule
                    to check if requested amount can be withdrawn. The minimum balance is
                    $10 for checking and $100 for savings account. If the withdrawal is allowed then update the balance of the appropriate account and
                    display the new balance. However, if the withdrawal is not allowed then display
                    an appropriate error message.                 
*/  
package bankatmswitch;

import java.util.Scanner;

/**
 * Class Assignment
 * @topic Conditional statement
 * @name ATM for the gator bank_Assignment #5
 * @date 02242015
 * @author Chohee Kim
 */

public class BankATMSwitch {

   
    public static void main(String[] args) {
       
        
        int SavingBalance = 500;
        int CheckingBalance = 1000;
        
        //Displaying the main menu.
        System.out.printf("Current checking balance : $%d \n"
                + "Current saving balance : $%d \n"
                + "3 possible transaction types : Check balance(c), Deposit(d), Withdrawal(w) \n\n\n"
                ,SavingBalance,CheckingBalance);
        
        //Ask the user for the account type on which s(he)wants to operate 
        Scanner input = new Scanner(System.in);
        System.out.print("Select the  account type(Saving(S), Checking(C)): ");
        String account = input.nextLine();
        
        //switch loop for S (Saving) and C ( Checking)
        switch(account){
           
            case("S") : { //when the user enter to operste Saving account
                
                //Ask the type of transaction the user wants to use
                System.out.print("Select the type of transaction (c/d/w) :");
                String trans = input.nextLine();
            
                switch(trans) {
                
                    case("c") : { //When the user wants to checking balance
                     
                        System.out.printf("Check the Balance \n"
                            + "The current balance : $%d \n\n",SavingBalance);
                        break;
                    }
                    case("d") : { //when the user wants to put deposit
                        
                        
                        //ask the user how much the user wants to deposit
                        System.out.print("Enter the amount to deposit :");
                        int deposit = input.nextInt();
                        
                        //declare new variable for new saving balance ( saving balance + deposit)
                        int NewSavingBalance = SavingBalance + deposit;
                        System.out.printf("Updated balance : $%d\n\n ",NewSavingBalance); 
                        break;
                
                    }
                    case("w") : { //when the user wants to withdraw
            
                        //ask the user how much the user wants to withdraw
                        System.out.printf("Enter the amount to withdraw (The minimum balance :$10) :");
                        int withdraw = input.nextInt();
                    
                        switch(withdraw/11){
                
                            case(0) : {   //when the user enters appropriate amount
                                
                                //Declare new variavle for new saving balance ( saving balance - withdraw)
                                int NewSavingBalance = SavingBalance - withdraw;
                                System.out.printf("Updated balance : $%d \n\n,",
                                                NewSavingBalance);
                                break;
                            }
                            default : { //when the user doesn't enter appropriate amount
                                
                                //error message!
                                System.out.println("ENTER LESS THAN $ 10 or EQUAL TO $10");
                            }
                        }    
                    }
            
                }
                
                break;
            }
            case("C") : { //When the user wants to operate Checking account
                
                //Ask the type of transaction the user wants to use
                System.out.print("Select the type of transaction (c/d/w) :");
                String trans = input.nextLine();
            
                switch(trans) {
                
                    case("c") : { //when the user wants to check balance
                     
                        System.out.printf("Check the Balance \n"
                            + "The current balance : $%d \n\n",CheckingBalance);
                        break;
                    }
                    case("d") : { //when the user wants to deposit
            
                        //Ask amount to deposit
                        System.out.print("Enter the amount to deposit :");
                        int deposit = input.nextInt();
                        
                        //Declare new variable for new checking balance ( original checking balance + deposit)
                        int NewCheckingBalance = CheckingBalance + deposit;
                        System.out.printf("Updated balance : $%d\n\n ",NewCheckingBalance); 
                        break;
                
                    }
                    case("w") : { // when the user wants to withdraw
            
                        //ask amount to withdraw
                        System.out.print("Enter the amount to withdraw "
                                + "(The minimum balance :$100) :");
                        int withdraw = input.nextInt();
                    
                        switch(withdraw/101){
                
                            case(0) : {   //when the user enter appropriate amount
                                
                                //declare new variable for new checkin balance ( original checking balance - withdraw)
                                int NewCheckingBalance = CheckingBalance - withdraw;
                                System.out.printf("Updated balance : $%d \n\n,",
                                                NewCheckingBalance);
                                break;
                            }
                            default : { //when the user doesn't enter appropriate amount
                                
                                //error message!
                                System.out.println("ENTER LESS THAN $ 100");
                            }
                        }    
                    }
            
                }
                
                break;
            }
        }
        
    }
}
