package elevatormethod;

import java.util.Scanner;

/**
 * Class Assignment #9-2
 * @topic Method
 * @name Elevator Method
 * @date 03302015
 * @author Chohee Kim
 */
public class ElevatorMethod {

    static Scanner input = new Scanner(System.in);
    static int E1 = 1, E2 = 3, E3 = 5, E4 = 9;
    static int boardingF, movingF, destinationF;
    static String movingE;

    public static boolean isValidFloor(int floor) {

        if (floor < 1 || floor > 9) {
            System.out.println("*Please enter the valid floor (from 1 to 9 )*");
            return false;
        } else {
            return true;
        }
    }

    public static void nearestFloor(int e1, int e2, int e3, int e4) {
        //find distance between boarding and elevators.
        int dise1 = Math.abs(e1 - boardingF);
        int dise2 = Math.abs(e2 - boardingF);
        int dise3 = Math.abs(e3 - boardingF);
        int dise4 = Math.abs(e4 - boardingF);
        //find the nearest elevator
        int min = dise1;
        movingE = "Elevator 1";
        movingF = e1;

        if (min > dise2) {
            min = dise2;
            movingE = "Elevator 2";
            movingF = e2;
        }
        if (min > dise3) {
            min = dise3;
            movingE = "Elevator 3";
            movingF = e3;
        }
        if (min > dise4) {
            min = dise4;
            movingE = "Elevator 4";
            movingF = e4;
        }

    }

    public static void movementOfE(int fromFloor, int toFloor) {
        //display the squence of floors it travles.
        if (fromFloor > toFloor) {
            for (int i = fromFloor; i >= toFloor; i--) {
                System.out.printf("%s is now at...%d, approching floor %d\n", movingE, i, toFloor);
            }
        } else {
            for (int i = fromFloor; i <= toFloor; i++) {
                System.out.printf("%s is now at...%d, approching floor %d\n", movingE, i, toFloor);
            }
        }

    }

    public static void changeFloor(int destinationF) {
        //initialize the moving elevator to destination floor
        switch (movingF) {
            case 1:
                E1 = destinationF;
                break;
            case 3:
                E2 = destinationF;
                break;
            case 5:
                E3 = destinationF;
                break;
            case 9:
                E4 = destinationF;
                break;
        }
    }

    public static void main(String[] args) {

        while (true) {
            //display where the elevators are.
            System.out.println("________________");
            System.out.printf("|Elevator 1 : %d| \n|Elevator 2 : %d| \n|Elevator 3 : %d|\n|Elevator 4 : %d| \n",
                    E1,E2,E3,E4);
            System.out.println("________________\n");
            
            //ask the user the boarding floor
            do {
                System.out.print("Enter your boarding floor : ");
                boardingF = input.nextInt();
            } while (!isValidFloor(boardingF));
            System.out.println();

           
            nearestFloor(E1, E2, E3, E4);

            //displahy what elevator is moving.
            System.out.printf("%s is moving to your boarding floor. \n", movingE);

            movementOfE(movingF, boardingF);

            //ask the user the destination floor.
            do {
                System.out.print("\nEnter your destination floor : ");
                destinationF = input.nextInt();
            } while (!isValidFloor(destinationF));

            System.out.println();
            
            movementOfE(boardingF, destinationF);
            changeFloor(destinationF);
        }

    }
    
}
