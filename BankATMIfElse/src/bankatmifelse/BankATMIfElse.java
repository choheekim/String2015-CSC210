/*
    It is a simple interface ATM program for the Gator Bank (using only If-else conditional statement).
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
package bankatmifelse;

import java.util.Scanner;

/**
 * Class Assignment
 * @topic Conditional statement
 * @name ATM for the gator bank_Assignment #5
 * @date 02242015
 * @author Chohee Kim
 */

public class BankATMIfElse {

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
        
        //first IF LOOP seperates between Saving and Checking
        if(account.equals("S")){ //Saving account operated
            
            //Ask the user for the type of transaction
            System.out.print("Select the type of transaction (c/d/w) :");
            String trans = input.nextLine();
            
            
            if(trans.equals("c")){ //when the user enter "c"
               
                System.out.printf("Check The Balance \n"
                        + "the current balance : $%d \n\n",SavingBalance);
            }else if(trans.equals("d")){ //when the user enter "d"
            
                //Ask the user how much the user wants to deposit
                System.out.print("Enter the amount to deposit :");
                int deposit = input.nextInt(); 
                
                //declare new valiable for new saving balance ( original saving balance + deposit)
                int NewSavingBalance = SavingBalance + deposit;
                System.out.printf("Updated balance : $%d\n\n ",NewSavingBalance); 
                
            }else if(trans.equals("w")){ //when the user enter "w"
            
                //Ask how much the user wants to withdraw
                System.out.printf("Enter the amount to withdraw (The minimum balance :$10) :");
                int withdraw = input.nextInt();
                
                if(withdraw<=10){ //if the user type appropriate amount
                
                    //declare new variable for new saving balance ( saving balance - withdraw)
                    int NewSavingBalance = SavingBalance - withdraw;
                    System.out.printf("Updated balance : $%d \n\n,",NewSavingBalance);
                    
                }else{ //if the user doesn't type appropriate amount
                    
                    
                    //error message!
                    System.out.println("ENTER LESS THAN $ 10 or EQUAL TO $10");
                }
                
            
            }
        }else{ //else from THE FIRST IF LOOP, when the user wants to operate checking saving.
        
            //Ask the user for the type of transaction
            System.out.print("Select the type of transaction (c/d/w) :");
            String trans = input.nextLine();
            
            if(trans.equals("c")){ //when the user enter "c"
               
                System.out.printf("Check Balance \n"
                        + "the current balance : $%d \n\n",CheckingBalance);
                
            }else if(trans.equals("d")){ //when the user enter "d"
                
                //Ask the user how much the user wants to deposit.
                System.out.print("Enter the amount to deposit :");
                int deposit = input.nextInt();
                
                //declare new variable ( Checking balance + deposit)
                int NewCheckingBalance = CheckingBalance + deposit;
                
                System.out.printf("Updated balance : $%d\n\n ",NewCheckingBalance); 
                
            }else if(trans.equals("w")){ //when the user enter "w"
            
                //Ask the user how much the user wants to withdraw
                System.out.printf("Enter the amount to withdraw "
                        + "(The minimum balance :$100) :");
                int withdraw = input.nextInt();
                
                if(withdraw<=100){ //if the user enter appropriate amount 
                
                    //Declare new variable that shows Checking balance - withdraw
                    int NewCheckingBalance = CheckingBalance - withdraw;
                    System.out.printf("Updated balance : $%d \n\n,",NewCheckingBalance);
                    
                }else{// if the user doesn't enter appropriate amount
                
                    //erorr message!
                    System.out.println("ENTER LESS THAN $ 100");
                }
            }
       }   
        
      
    }
    
}
