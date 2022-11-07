package com.swirlydragon;

public class Board {
    //the game board and dimensions attributes
    private char[][] guess_memory;
    private static final int guess_number = 12;
    public static int guess_size = 4;
    private char[][] clue_memory;
    private char[] code;


    //Constructor to create the board
    public Board(){
        guess_memory = new char[guess_number][guess_size];
        clue_memory = new char[guess_number][guess_size];
        code = new char[guess_size];
    }
    //returns peg in a certain place on the board
    public char getPeg(int x, int y){
        return guess_memory[x][y];
    }
    //placing a peg on the board
    public void placePeg(int x, int y, char pegColour){
        guess_memory[x][y] = pegColour;
    }
    //returns clue in a certain place on the board
    public char getClue(int x, int y){
        return clue_memory[x][y];
    }
    //placing a clue on the board
    public void placeClue(int x, int y, char pegColour){
        clue_memory[x][y] = pegColour;
    }
    //returns peg in a certain place of the clue
    public char getCodePeg(int x){
        return code[x];
    }
    //placing a peg for the code
    public void placeCodePeg(int x, char pegColour) {
        code[x] = pegColour;
    }
    public static int getGuessSize(){
        return guess_size;
    }

}
