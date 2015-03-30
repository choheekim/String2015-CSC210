package simplechess;

import java.util.Scanner;

/**
 * Class Assignment
 * 
* @topic Multidimensional Array
 * @name Simple Chess Game
 * @date 03202015
 * @author Chohee Kim
 */
public class SimpleChess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opt = 1;
        boolean finished;
        String[][] chessColor = new String[8][8];

        for (int row = 0; row < 2; row++) {
            for (int colum = 0; colum < chessColor[row].length; colum++) {
                chessColor[row][colum] = "black";
            }
        }
        for (int row = 2; row < (chessColor.length) - 2; row++) {
            for (int colum = 0; colum < chessColor[row].length; colum++) {
                chessColor[row][colum] = "empty";
            }
        }
        for (int row = (chessColor.length) - 2; row < chessColor.length; row++) {
            for (int colum = 0; colum < chessColor[row].length; colum++) {
                chessColor[row][colum] = "white";
            }
        }
        //prompt the user to choose the color s(he) wants to play
        System.out.print("What colors do you want to use (black or white)? ");
        String color = input.next();
        System.out.println();

        while (opt != 0) {
            finished = true;
        //Display the current status of the chess board,
            //and the color that the user is currently playing for
            System.out.println("********You are curretnly playing for " + color + "********");
            System.out.println("*******The current status of the chess board*******");
            System.out.println("_________________________________________________");
            for (int row = 0; row < chessColor.length; row++) {
                System.out.print("|");
                for (int colum = 0; colum < chessColor[row].length; colum++) {
                    System.out.print(chessColor[row][colum] + "|");
                }
                System.out.println();
                System.out.println("_________________________________________________");
            }
            System.out.println();

            while (finished) {
                //Prompt the user to make a move
                //1. enter the location of the piece the user wants to move
                System.out.print("Specify the current location of the piece to move (row colum) : ");
                int curRow = input.nextInt();
                int curColum = input.nextInt();
                //Check for vaild indexes of row
                while (curRow > 8 || curRow < 0) {
                    System.out.print("Row should be less or equal to 8, Enter the row :");
                    curRow = input.nextInt();
                }
                //Check for vaild indexes for colum
                while (curColum > 8 || curColum < 0) {
                    System.out.print("Colum should be less or equal to 8, Enter the Colum");
                    curColum = input.nextInt();
                }

                //2. enter the destination of the piece
                System.out.print("Specify the desired destination of the piece (row colum) : ");
                int desRow = input.nextInt();
                int desColum = input.nextInt();

                //Check for valid indexes for row.
                while (desRow > 8 || desRow < 0) {
                    System.out.print("Row should be less or equal to 8, Enter the row : ");
                    curRow = input.nextInt();
                }

                //Check for valid indexes for coulum
                while (desColum > 8 || desColum < 0) {
                    System.out.print("Colum should be less or equal to 8, Enter the Colum : ");
                    curColum = input.nextInt();
                }

                System.out.println();

                //Check whether there is a piece at the specified current location.
                if (!(chessColor[curRow][curColum]).contains(color)) {
                    System.out.println("\"There is nothing to move, you should pick up"
                            + " a different square.\"\n");
                    continue;
                }

                boolean rightMove = false;
                
                //Check whether the desired location is empty. if not, inform user that
                //the move can not be completed because the destination square is occupied.
                if ((chessColor[desRow][desColum]).equals("empty")) {
                    
                    rightMove = true;

                } else {
                    System.out.println("The move can not be completed because the destination square"
                            + " is occupied");
                    continue;
                }
                
                if (rightMove) {
                    
                    System.out.printf("Your move is completed.\n"
                            + "Your piece is moving from %d, %d to %d, %d\n\n",
                            curRow, curColum, desRow, desColum);
                    
                    //swtich pieces
                    String temp1 = chessColor[desRow][desColum];
                    chessColor[desRow][desColum] = chessColor[curRow][curColum];
                    chessColor[curRow][curColum] = temp1;
                    
                    //display the current chessboard after a change.
                    System.out.println("********You are curretnly playing for " + color + "********");
                    System.out.println("The current status of the chess board after your move");
                    System.out.println("_________________________________________________");
                    for (int row = 0; row < chessColor.length; row++) {
                        System.out.print("|");

                        for (int colum = 0; colum < chessColor[row].length; colum++) {
                            System.out.print(chessColor[row][colum] + "|");
                        }
                        System.out.println();
                        System.out.println("_________________________________________________");
                    }
                    System.out.println();
                    
                    //switch the color
                    if (color.equals("black")) {
                        color = "white";
                    } else {
                        color = "black";
                    }
                    
                    //ask if the user wants to quit the game.
                    System.out.print("To quit the game press 0, if not enter any other numbers : ");
                    opt = input.nextInt();
                    System.out.println("\n\nYour colol will be swtiched (White -> Black or Black -> While).\n\n");
                } else {
                    continue;
                }
                finished = false;
            }
        }
    }

}


