/*
    A program for an inventory management. Used it to learn about arrays. 
*/
package inventorymanagement;

import java.util.Scanner;

/**
 * Class Assignment
 * @topic Array
 * @name Inventory Management. Assignment #7
 * @date 03102015
 * @author Chohee Kim
 */
public class InventoryManagement {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        //Declare and creat three array
        String[] items = {"notepad","pen","pencil","eraser","marker"};
        int[] quantity = new int[5];
        double[] price = new double[5];
        double[] itemTotalValue= new double[5]; //4th array for inventory value 
        

        for(int index = 0; index < 5; index++){
        //user provides quntity of each items
        //do-while : if the user puts number less than 0, will ask quantity of the item again.    
            do{
                
                System.out.printf("Enter quantity of %s (greater than or equal to 0) : ",items[index]);
                quantity[index] = input.nextInt();
                
            }while(quantity[index] < 0);
            
        }
        
        System.out.print("\n");
          
        for(int index = 0; index < 5; index++){
        //user provides price of each items
        //do-while : if the user puts number less than 0, will ask quantity of the item again.  
            do{
       
                System.out.printf("Enter price of %s (grater than or equal to 0) : $ ",items[index]);
                price[index] = input.nextDouble();
                
            }while(price[index] < 0);
        
        }
        
        //initialize Array for item value.
        for(int index = 0; index < 5; index++){
            
            itemTotalValue[index] = price[index] * quantity[index];
            
        }
        
        System.out.print("\n");
           
        
        String opt = "a";
        
        //the program is working until the user enter 'e' for exit.
        while(!opt.equals("e")){
            
            
            //the user enter an option for an operation to use
            System.out.print("Print Inventory(p) \nCheck for low inventory(c)"
                + "\nHighest and lowest inventory value items(h) \nTotal inventory value(v) \nExit(e)\n"
                    + "Choose operation : ");
            opt = input.next();
            
            System.out.print("\n");
            
            switch(opt){
                
                //when the user put "p" for the option
                case("p") : {
                
                    //print the inventory
                    System.out.printf("%7s | %8s | %7s |%8s \n","Item","Quantity","Price","Item total value");
                    
                    for(int index = 0; index < 5; index ++){
                       
                        System.out.printf("%7s | %8d | $%6.2f |$%8.2f \n",items[index],quantity[index],price[index],itemTotalValue[index]);
                    }        
                    
                    System.out.print("\n");
                    continue; //go back to the loop asking the option for the user
                }   
            
                //when the user enter "c" for the option
                case("c") : {
            
                    int cnt = 0;
                    
                    for(int index = 0; index < 5; index++){
                    //checking if there is any item having low quantity (less than 5)
                        if(quantity[index] < 5){
                            //if there are any items having low quantity, print the inventory
                            if(cnt == 0){
                                System.out.print("       A list of low inventory items\n");
                                System.out.printf("%7s | %8s | %7s |%8s \n","Item","Quantity","Price","Iventory Value");
                            }
                            System.out.printf("%7s | %8d | $%6.2f |$%8.2f \n",items[index],quantity[index],price[index],itemTotalValue[index]);
                            cnt++;
                        }
                        
                    }
                    
                    //if there is no item having fewer quantity than 5, print "There is no low inventory"!
                    if(cnt == 0){
                    
                            System.out.println("There is no low inventory!\n");
                    }
                    
                    System.out.print("\n");
     
                    continue;    //go back to the loop asking the option for the user   
                }
                //when the user enter "h" for the option
                case("h") :{
                    
                    double max = itemTotalValue[0];
                    double min = itemTotalValue[0];
                    int maxIdx = 0;
                    int minIdx = 0;
                    
                    //find the item with the highest inventory value
                    
                    for(int index = 0; index < 5; index++){
            
                        if(max < itemTotalValue[index]) {
                        
                            max = itemTotalValue[index];
                            maxIdx = index;
                        }
                        
                    }
                    
                //find the item with the lowest inventory value 
                    
                    for(int index = 0; index < 5; index++) {
                        
                        if(min > itemTotalValue[index]){
                            
                            min = itemTotalValue[index];
                       }
                    }
                    System.out.println("The item(s) with the highest inventory value : ");  
                    System.out.printf("%7s | %8s | %7s |%8s \n","Item","Quantity","Price","Item total value");                     
                   //print the item with the higest value
                    for(int index = 0; index < 5; index ++){
                        
                        if(max == itemTotalValue[index]){
                            
                            System.out.printf("%7s | %8d | $%6.2f |$%8.2f \n",items[index],quantity[index],price[index],itemTotalValue[index]);
                        
                        }
                    }
                    
                    System.out.println("The item(s) with the lowest inventory value : ");
                    System.out.printf("%7s | %8s | %7s |%8s \n","Item","Quantity","Price","Item total value"); 
                    //print the item with the lowest value                    
                    for(int index = 0; index < 5; index ++){            
                        
                        if(min == itemTotalValue[index]){
   
                            System.out.printf("%7s | %8d | $%6.2f |$%8.2f \n",items[index],quantity[index],price[index],itemTotalValue[index]);
                        
                        }
                    }
                    
                    System.out.print("\n");
                    continue; //go back to the loop asking the option for the user
                }
                
                //when the user enter "v" for the option
                case("v") :  {
                    
                    double total = 0;
                    
                    //find sum for all inventory values
                    for(int index = 0; index < 5; index++){
                        
                        total += itemTotalValue[index];              
                    }
                    
                    System.out.printf("Total inventory value : $%.2f\n\n", total);
                    continue; //go back to the loop asking the option for the user
                    
                } 

                case("e") : {
                    
                    break; //by getting out of the loop and finish the program
                }
            }   
        
        }
       
       
       
        
        
    }
    
    
}
    