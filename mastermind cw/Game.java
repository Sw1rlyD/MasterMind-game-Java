package com.swirlydragon;

import java.util.Locale;
import java.util.Scanner;
//Class to run the game and contain the game logic
public class Game {
    private Board board = new Board();  //create instance of the board class
    private Display displayBoard = new Display();  //created instance of the display class
    Scanner myObj = new Scanner(System.in); // making a scanner object to read user input
    char[] guessToCheck;
    char[] codeToCheck;
    char[] clues;
    boolean solved = false;






    //method to check the guess and return clue pegs
    public char[] checkCode(char[] guessToCheck, char[] codeToCheck, int attempt){
        char [] cluePegs;
        cluePegs = new char [board.getGuessSize()];


        if (guessToCheck[0] == codeToCheck[0]){
            cluePegs[0] = 'b';
        } else if (guessToCheck[0] == codeToCheck[1]){
            cluePegs[0] = 'w';
        } else if (guessToCheck[0] == codeToCheck[2]){
            cluePegs[0] = 'w';
        } else if (guessToCheck[0] == codeToCheck[3]){
            cluePegs[0] = 'w';}


        if (guessToCheck[1] == codeToCheck[1]){
            cluePegs[1] = 'b';
        } else if (guessToCheck[1] == codeToCheck[0]){
            cluePegs[1] = 'w';
        } else if (guessToCheck[1] == codeToCheck[2]){
            cluePegs[1] = 'w';
        } else if (guessToCheck[1] == codeToCheck[3]){
            cluePegs[1] = 'w';}

        if (guessToCheck[2] == codeToCheck[2]){
            cluePegs[2] = 'b';
        } else if (guessToCheck[2] == codeToCheck[0]){
            cluePegs[2] = 'w';
        } else if (guessToCheck[2] == codeToCheck[1]){
            cluePegs[2] = 'w';
        } else if (guessToCheck[2] == codeToCheck[3]){
            cluePegs[2] = 'w';}

        if (guessToCheck[3] == codeToCheck[3]){
            cluePegs[3] = 'b';
        } else if (guessToCheck[3] == codeToCheck[0]){
            cluePegs[3] = 'w';
        } else if (guessToCheck[3] == codeToCheck[2]){
            cluePegs[3] = 'w';
        } else if (guessToCheck[3] == codeToCheck[1]){
            cluePegs[3] = 'w';}

        board.placeClue(attempt,0, cluePegs[0]);
        board.placeClue(attempt,1, cluePegs[1]);
        board.placeClue(attempt,2, cluePegs[2]);
        board.placeClue(attempt,3, cluePegs[3]);
        return cluePegs;


    }








    public Game(){
        guessToCheck = new char[board.getGuessSize()];
        codeToCheck = new char[board.getGuessSize()];
        System.out.println("Welcome to Mastermind");
        System.out.println("Code-maker, please set the code");
        // for loop which contains the code which facilitates the user to enter a code
        for (int i = 0; i < board.getGuessSize(); i++) {
            System.out.println("Enter the next peg colour for your code, (r, y, o or g)");
            char codePeg = myObj.next().charAt(0);
            while (codePeg != 'r' && codePeg != 'g' && codePeg != 'y' && codePeg != 'o') { //while loop to handle invalid user inputs
                System.out.println("Error: please type a valid colour in the format of a single lowercase character (r, y, o or g):");
                codePeg = myObj.next().charAt(0);
            }
            board.placeCodePeg(i, codePeg);


            codeToCheck[i] = codePeg;
        }

        displayBoard.printCode(board);
        System.out.println("The code is set!");

        // time delay before running the space to allow the messages to be read
        try
        {
            System.out.println("Get ready to swap to the code-breaker");

            Thread.sleep(3000);

        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }

        //space to hide the code from the code-breaker so they can play without seeing the code previously entered.
        for (int i = 0; i < 1000; i++){
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        }
        System.out.println("Code-breaker it is time to start guessing the code!");


        //for loop for user to guess code
        int attempt = 0;
        while (solved == false) {


            for (int i = 0; i < board.getGuessSize(); i++) {

                System.out.println("Select the next peg colour for your guess, (r, y, o, g)");
                char peg = myObj.next().charAt(0);

                while (peg != 'r' && peg != 'g' && peg != 'y' && peg != 'o') {
                    System.out.println("Error: please type a valid colour in the format of a single lowercase character (r, y, o or g):");
                    peg = myObj.next().charAt(0);
                }
                board.placePeg(attempt, i, peg);


                guessToCheck[i] = peg;
            }
            clues = checkCode(guessToCheck, codeToCheck, attempt);





            attempt += 1;
            displayBoard.print(board);

            // If statement to end the game if run out of guesses
            if (attempt == 12){
                System.out.println("You have lost the game!!!! The code-maker wins.");
                System.out.println("The code was:");
                System.out.println(codeToCheck);

            }
            // If statement to end the game if code is correctly guessed.
            if (clues[0] == 'b' && clues[1] == 'b' && clues[2] == 'b' && clues[3] == 'b') {
                solved = true;
                System.out.println("You have broken the code! Congratulations");


        }
//        for (int i = 0; i < board.getGuessSize(); i++) {
//            System.out.println("Select the next peg colour for your guess, (r, y, o, g)");
//            char peg = myObj.next().charAt(0);
//
//            while (peg != 'r' && peg != 'g' && peg != 'y' && peg != 'o') {
//                System.out.println("Error: please type a valid colour in the format of a single lowercase character (r, y, o or g):");
//                peg = myObj.next().charAt(0);
//            }
//            board.placePeg(0, i, peg);
//
//
//            guessToCheck[i] = peg;
//        }
//        clues = checkCode(guessToCheck, codeToCheck);
//
//
//
//
//
//
//        displayBoard.print(board);
//        if (clues[0] == 'b' && clues[1] == 'b' && clues[2] == 'b' && clues[3] == 'b') {
//            solved = true;
//            System.out.println("You have broken the code! Congratulations");
        }

    }
}
