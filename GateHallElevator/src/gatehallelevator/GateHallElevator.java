/*
    A program running for elevator in a gatehall that has 9 floors. 
Prompt the user to input the floor they want to board the elevator at and send 
the nearest elevator. If there are two or more elevators that are equally near to 
the boarding floor then choose the one with the smallest elevator number. T
Take the elevator to the destination floor.

*/
package gatehallelevator;

import java.util.Scanner;

/**
 * Class Assignment
 * @topic Loop
 * @name Elevator. Assignment #6
 * @datek 03022015
 * @author Chohee Kim
 */
public class GateHallElevator {

    public static void main(String[] args) {
       
         //declare elevators and the floors where the elevators are at
        int E1 = 1, E2 = 3, E3 = 5, E4 = 9;
        
        while(true){ //using infinite loop now that it is not required certain times to run.
 
            System.out.printf("Where elevators are at now\nE1 = %d \nE2 = %d \nE3 = %d \nE4 = %d\n",
                    E1,E2,E3,E4);
            
            //a user enters the floor to board the elevator at
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the floor to board the elevator at : ");
            int boardingFloor = input.nextInt();
        
            //checking if it's a valid floor
            while(boardingFloor < 1 || boardingFloor > 9) {

                System.out.print("Enter the floor to board the elevator at ( 1 to 9 ) : ");
                boardingFloor = input.nextInt();   
            }            
       
            
            //find the distance between the elevators and the floor
            int distanceE1 = E1 - boardingFloor;
            int distanceE2 = E2 - boardingFloor;
            int distanceE3 = E3 - boardingFloor;
            int distanceE4 = E4 - boardingFloor;
            
            //because the distance can be negative numbers, make it absolute values
            if(distanceE1 < 0){
                distanceE1 = distanceE1 * (-1);
            }
            if(distanceE2 < 0){
                distanceE2 = distanceE2 * (-1);
            }
            if(distanceE3 < 0){
                distanceE3 = distanceE3 * (-1);
            }
            if(distanceE4 < 0){
                distanceE4 = distanceE4 * (-1);
            }
            
            /*
              find the minimum distance and find which elevator will be approching to the user.
              Store name of the elevator into String.
            */
            int min = distanceE1;
            String movingElevator = "E1";
            
            if(min > distanceE2){
                min = distanceE2;
                movingElevator = "E2";
            }
            if(min > distanceE3){
                min = distanceE3;
                movingElevator = "E3";
            }
            if(min > distanceE4){
                min = distanceE4;
                movingElevator = "E4";
            }
            
           System.out.println("\nElevator " + movingElevator + " is moving to the boarding floor \n");
           
           switch(movingElevator){
           
            case("E1") : {

                
                   if(boardingFloor > E1){
                       
                       for(; boardingFloor != E1 ;E1++){
                           
                           System.out.printf("Elevator 1 is moivng to %d and is now at %d\n",boardingFloor,E1);
                       }
                   } else if(boardingFloor < E1){
                       
                       for(; boardingFloor != E1 ; E1--){
                           System.out.printf("Elevator 1 is moivng to %d and is now at %d\n",boardingFloor,E1);
                           
                       }
                   }

                   if(boardingFloor == E1){
                   
                       System.out.printf("Elevator 1 is now at %d \n\n",boardingFloor);
                   }                   
                   break;
            }
            case("E2") : {
                
                   if(boardingFloor > E2){
                       
                       for(; boardingFloor != E2 ;E2++){
                           
                           System.out.printf("Elevator 2 is moivng to %d and is now at %d\n",boardingFloor,E2);
                       }
                   } else if(boardingFloor < E2){
                       
                       for(; boardingFloor != E2 ; E2--){
                           System.out.printf("Elevator 2 is moivng to %d and is now at %d\n",boardingFloor,E2);
                           
                       }
                   }
                   if(boardingFloor == E2){
                   
                       System.out.printf("Elevator 2 is now at %d \n\n",boardingFloor);
                   }
                   break;
            }
            case("E3") : {
                
                
                   if(boardingFloor > E3){
                       
                       for(; boardingFloor != E3 ;E3++){
                           
                           System.out.printf("Elevator 3 is moivng to %d and is now at %d\n",boardingFloor,E3);
                       }
                   } else if(boardingFloor < E3){
                       
                       for(; boardingFloor != E3 ; E3--){
                           System.out.printf("Elevator 3 is moivng to %d and is now at %d\n",boardingFloor,E3);
                           
                       }
                   }
                   if(boardingFloor == E3){
                   
                       System.out.printf("Elevator 3 is now at %d \n\n",boardingFloor);
                   }                   
                   break;
            }
            case("E4") : {                 
                
                   if(boardingFloor > E4){
                       
                       for(; boardingFloor != E4 ;E4++){
                           
                           System.out.printf("Elevator 4 is moivng to %d and is now at %d\n",boardingFloor,E4);
                       }
                   } else if(boardingFloor < E4){
                       
                       for(; boardingFloor != E4 ; E4--){
                           System.out.printf("Elevator 4 is moivng to %d and is now at %d\n",boardingFloor,E4);
                           
                       }
                   }
                   
                   if(boardingFloor == E4){
                   
                       System.out.printf("Elevator 4 is now at %d \n\n",boardingFloor);
                   }                   
                   break;
            }
           
           }
           // the user enters the destination floor
           System.out.print("Enter the destination floor : ");
           int destinationFloor = input.nextInt();
           
           //checking if it's a valid floor
           while(destinationFloor < 1 || destinationFloor > 9) {

                System.out.print("Enter the destination floor, valid floor number ( 1 to 9 ) : ");
                destinationFloor = input.nextInt();   
            }      
           
           /*Because "movingElevator" is a String, need to switch to find out which elevator moved
             and send the elevator to a destination floor.
           */
            switch(movingElevator){
           
            case("E1") : {

                
                   if(destinationFloor > E1){
                       
                       for(; destinationFloor != E1 ;E1++){
                           
                           System.out.printf("Elevator 1 is moivng to %d and is now at %d\n",destinationFloor,E1);
                       }
                   } else if(destinationFloor < E1){
                       
                       for(; destinationFloor != E1 ; E1--){
                           System.out.printf("Elevator 1 is moivng to %d and is now at %d\n",destinationFloor,E1);
                           
                       }
                   }

                   if(destinationFloor == E1){
                   
                       System.out.printf("Elevator 1 is now at %d \n\n",destinationFloor);
                   }                   
                   break;
            }
            case("E2") : {
                
                   if(destinationFloor > E2){
                       
                       for(; destinationFloor != E2 ;E2++){
                           
                           System.out.printf("Elevator 2 is moivng to %d and is now at %d\n",destinationFloor,E2);
                       }
                   } else if(destinationFloor < E2){
                       
                       for(; destinationFloor != E2 ; E2--){
                           System.out.printf("Elevator 2 is moivng to %d and is now at %d\n",destinationFloor,E2);
                           
                       }
                   }
                   if(destinationFloor == E2){
                   
                       System.out.printf("Elevator 2 is now at %d \n\n",destinationFloor);
                   }
                   break;
            }
            case("E3") : {
                
                
                   if(destinationFloor > E3){
                       
                       for(; destinationFloor != E3 ;E3++){
                           
                           System.out.printf("Elevator 3 is moivng to %d and is now at %d\n",destinationFloor,E3);
                       }
                   } else if(destinationFloor < E3){
                       
                       for(; destinationFloor != E3 ; E3--){
                           System.out.printf("Elevator 3 is moivng to %d and is now at %d\n",destinationFloor,E3);
                           
                       }
                   }
                   if(destinationFloor == E3){
                   
                       System.out.printf("Elevator 3 is now at %d \n\n",destinationFloor);
                   }                   
                   break;
            }
            case("E4") : {                 
                
                   if(destinationFloor > E4){
                       
                       for(; destinationFloor != E4 ;E4++){
                           
                           System.out.printf("Elevator 4 is moivng to %d and is now at %d\n",destinationFloor,E4);
                       }
                   } else if(destinationFloor < E4){
                       
                       for(; destinationFloor != E4 ; E4--){
                           System.out.printf("Elevator 4 is moivng to %d and is now at %d\n",destinationFloor,E4);
                           
                       }
                   }
                   
                   if(destinationFloor == E4){
                   
                       System.out.printf("Elevator 4 is now at %d \n\n",destinationFloor);
                   }                   
                   break;
            }
           
           }          

            
        }
       
    }
}
