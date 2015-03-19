package simplechess;

import java.util.Scanner;

/**
 * Class Assignment
 *
 * @topic Multidimension Array
 * @name Simple Chess Game
 * @date 03182015
 * @author Chohee Kim
 */
public class SimpleChess {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opt = 1;
        boolean finished;
        String[][] chessColor = new String[8][8];
        String[][] pieces = {
            {" rook ", "knight", "bishop", " queen", " king ", "bishop", "knight", " rook "},
            {" pawn ", " pawn ", " pawn ", " pawn ", " pawn ", " pawn ", " pawn ", " pawn "},
            {" empty", " empty", " empty", " empty", " empty", " empty", " empty", " empty"},
            {" empty", " empty", " empty", " empty", " empty", " empty", " empty", " empty"},
            {" empty", " empty", " empty", " empty", " empty", " empty", " empty", " empty"},
            {" empty", " empty", " empty", " empty", " empty", " empty", " empty", " empty"},
            {" pawn ", " pawn ", " pawn ", " pawn ", " pawn ", " pawn ", " pawn ", " pawn "},
            {" rook ", "knight", "bishop", " queen", " king ", "bishop", "knight", " rook "},};

        for (int row = 0; row < 2; row++) {
            for (int colum = 0; colum < chessColor[row].length; colum++) {

                chessColor[row][colum] = " black";
            }
        }
        for (int row = 2; row < (chessColor.length) - 2; row++) {
            for (int colum = 0; colum < chessColor[row].length; colum++) {

                chessColor[row][colum] = " empty";
            }
        }

        for (int row = (chessColor.length) - 2; row < chessColor.length; row++) {
            for (int colum = 0; colum < chessColor[row].length; colum++) {

                chessColor[row][colum] = " white";
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
            System.out.println("_________________________________________________________");

            for (int row = 0; row < chessColor.length; row++) {
                System.out.print("|");
                for (int col = 0; col < chessColor[row].length; col++) {
                    System.out.print(pieces[row][col] + "|");
                }
                System.out.print("\n|");
                for (int colum = 0; colum < chessColor[row].length; colum++) {

                    System.out.print(chessColor[row][colum] + "|");
                }
                System.out.println();
                System.out.println("_________________________________________________________");

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

                System.out.println("Your piece is " + pieces[curRow][curColum] + "\n");

                boolean rightMove = true;
                //Check whether the desired location is empty. if not, inform user that
                //the move can not be completed because the destination square is occupied.
                if ((chessColor[desRow][desColum]).equals(" empty")) {

                    switch (pieces[curRow][curColum]) {

                        case " king ": {

                            //find if it is a valid move.
                            //the range is king can move is [row -1 , row + 1] and [colum - 1, colum + 1]
                            int kingRow = Math.abs(desRow - curRow);
                            int kingCol = Math.abs(desColum - desColum);

                            if (kingRow + kingCol <= 2) {
                                break;
                            } else {
                                System.out.println("Invalid Move.");
                                rightMove = false;
                            }
                            break;

                        }
                        case " queen": {

                            boolean valid = false;

                            int queenRowCol = curRow * 10 + curColum;
                            int queenMRowCol = desRow * 10 + desColum;
                            int queenDiff = Math.abs(queenMRowCol - queenRowCol);

                            if (queenDiff % 11 == 0 || queenDiff % 9 == 0) {
                                valid = true;
                            }
                            if (curRow == desRow || curColum == desColum) {
                                valid = true;
                            }

                            if (valid) {

                            } else {
                                rightMove = false;
                            }

                            break;
                        }
                        case " rook ": {

                            /*  if it is a valid move, the current row is equal to the destination row
                             or current colum is equal to the destination row
                             */
                            if (curRow == desRow || curColum == desColum) {

                                //Checking if there is any other pieces in the path of the move.
                                // 1. if the current row is equal to the destination row. 
                                if (curColum == desColum) {

                                    //if the piece is moving from top to bottom.
                                    if (curRow < desRow) {
                                        for (int i = curRow + 1; i < desRow; i++) {
                                            if (!pieces[i][curColum].equals(" empty")) {
                                                rightMove = false;
                                            }
                                        }
                                        //if the piece is moving from botton to top.   
                                    } else {
                                        if (curRow > desRow) {
                                            for (int i = curRow - 1; i < desRow; i--) {
                                                if (!pieces[i][curColum].equals(" empty")) {
                                                      rightMove = false;
                                                }
                                            }
                                        }
                                    }
                                    //if the piece is moving horizontally.   
                                }else if (curRow == desRow) {
                                    //if it moves from left to right.
                                    if (curColum < desColum) {
                                        for (int i = curColum + 1; i < desColum; i++) {
                                            if (!pieces[curRow][i].equals(" empty")) {
                                                rightMove = false;
                                            }
                                        }
                                        //if the piece is moving from right to left.  
                                    }else {
                                        if (curColum > desColum) {
                                            for (int i = curColum - 1; i < desColum; i--) {
                                                if (!pieces[curRow][i].equals(" empty")) {        
                                                    rightMove = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Invalid Move.");
                                rightMove = false;
                            }
                            break;
                        }
                        case "bishop": {

                            boolean valid = false;

                            // when you make row and colum as two digit numbers ex. (1,2) -> 12           
                            int bishopRowCol = curRow * 10 + curColum;
                            int bishopMRowCol = desRow * 10 + desColum;
                            int bishopDiff = Math.abs(bishopMRowCol - bishopRowCol);

                            //the differnces between the current location numbers and the destination location numbers
                            //should be divisible by 11 or 9
                            if (bishopDiff % 11 == 0 || bishopDiff % 9 == 0) {
                                valid = true;
                            } else {
                                System.out.println("Invalid Move.");
                                rightMove = false;
                            }

                            System.out.println(valid);
                            
                            //check if there is any other pieces in the path of the move
                            if (valid) {
                                //if the user makes a valid move, there are 4 possiblities
                                //if the piece is moving to top right, top left, bottom right, and bottem left.
                                if ((curRow > desRow) && (curColum < desColum)) {
                                    //top right
                                    for (int i = curRow - 1, j = curColum + 1; i > desRow && j < desColum; i--, j++) {
                                        System.out.println("omg");
                                        if (!pieces[i][j].contains("empty")) {                                           
                                            System.out.println("boobs");
                                            rightMove = false;
                                            break;
                                        }
                                    } 
                                }else if ((curRow > desRow) && (curColum > desColum)) {
                                    //top left
                                    for (int i = curRow - 1, j = curColum - 1; i > desRow && j > desColum; i--, j--) {
                                        if (!pieces[i][j].equals(" empty")) {
                                            rightMove = false;
                                            break;
                                        } 
                                    }
                                }else if ((curRow < desRow) && (curColum < desColum)) {
                                    //bottom right
                                    for (int i = curRow + 1, j = curColum + 1; i < desRow && j < desColum; i++, j++) {
                                        if (!pieces[i][j].equals(" empty")) {                                           
                                            rightMove = false;
                                            break;
                                        }
                                    }
                                }else if((curRow  < desRow) && (curColum > desRow)){
                                    //bottom left
                                    for (int i = curRow + 1, j = curColum - 1; i < desRow && j > desColum; i++, j--) {
                                        if (!pieces[i][j].equals(" empty")) {
                                              rightMove = false;
                                              break;
                                        }
                                    }   
                                }
                            }

                            break;
                        }
                        case "knight": {

                            int knightRowCol = curRow * 10 + curColum;
                            int knightMRowCol = desRow * 10 + desColum;
                            int knightDiff = Math.abs(knightMRowCol - knightRowCol);

                            if ((knightDiff == 8) || (knightDiff == 12)
                                    || (knightDiff == 19) || (knightDiff == 21)) {

                                break;
                            } else {
                                System.out.println("Invalid Move.");
                                rightMove = false;
                            }
                            break;
                        }
                        case " pawn ": {

                            if (color.equals("black")) {
                                if ((curRow == desRow - 1) && (curColum == desColum)) {

                                    break;
                                } else {
                                    System.out.println("Invalid Move.");
                                    rightMove = false;
                                }

                            } else {
                                if ((curRow == desRow + 1) && (curColum == desColum)) {

                                    break;
                                } else {
                                    System.out.println("Invalid Move.");
                                    rightMove = false;
                                }
                            }
                            break;
                        }
                    }

                }else {
                    System.out.println("The move can not be completed because the destination square"
                            + "is occupied");
                    continue;
                }

                if(rightMove) {

                    System.out.printf("Your move is completed.\n"
                            + "Your piece is moving from %d, %d to %d, %d\n\n",
                            curRow, curColum, desRow, desColum);

                    String temp1 = chessColor[desRow][desColum];

                    String temp2 = pieces[desRow][desColum];

                    chessColor[desRow][desColum] = chessColor[curRow][curColum];
                    pieces[desRow][desColum] = pieces[curRow][curColum];

                    chessColor[curRow][curColum] = temp1;
                    pieces[curRow][curColum] = temp2;

                    System.out.println("***********You are curretnly playing for " + color + "***********");
                    System.out.println("***The current status of the chess board after your move***");
                    System.out.println("_________________________________________________________");

                    for (int row = 0; row < chessColor.length; row++) {
                        System.out.print("|");
                        for (int col = 0; col < chessColor[row].length; col++) {
                            System.out.print(pieces[row][col] + "|");
                        }
                        System.out.print("\n|");
                        for (int colum = 0; colum < chessColor[row].length; colum++) {

                            System.out.print(chessColor[row][colum] + "|");
                        }
                        System.out.println();
                        System.out.println("_________________________________________________________");

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
