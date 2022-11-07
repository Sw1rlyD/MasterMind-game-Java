package com.swirlydragon;

public class Display {
    public void print(Board board){
        String printOut = " ";
        printOut += "ooo        ooooo                        .                                         o8o                    .o8  \n" +
                "`88.       .888'                      .o8                                         `\"'                   \"888  \n" +
                " 888b     d'888   .oooo.    .oooo.o .o888oo  .ooooo.  oooo d8b ooo. .oo.  .oo.   oooo  ooo. .oo.    .oooo888  \n" +
                " 8 Y88. .P  888  `P  )88b  d88(  \"8   888   d88' `88b `888\"\"8P `888P\"Y88bP\"Y88b  `888  `888P\"Y88b  d88' `888  \n" +
                " 8  `888'   888   .oP\"888  `\"Y88b.    888   888ooo888  888      888   888   888   888   888   888  888   888  \n" +
                " 8    Y     888  d8(  888  o.  )88b   888 . 888    .o  888      888   888   888   888   888   888  888   888  \n" +
                "o8o        o888o `Y888\"\"8o 8\"\"888P'   \"888\" `Y8bod8P' d888b    o888o o888o o888o o888o o888o o888o `Y8bod88P\" \n" +
                "                                                                                                              \n" +
                "                                                                                                              " +
                "                                                                                                             ";
        printOut += "\n";
        printOut += "GUESSES: CLUES:";
        printOut += "\n";
        printOut += board.getPeg(0,0);
        printOut += board.getPeg(0,1);
        printOut += board.getPeg(0,2);
        printOut += board.getPeg(0,3);
        printOut += "     ";
        printOut += board.getClue(0,0);
        printOut += board.getClue(0,1);
        printOut += board.getClue(0,2);
        printOut += board.getClue(0,3);
        printOut +="\n";
        printOut += board.getPeg(1,0);
        printOut += board.getPeg(1,1);
        printOut += board.getPeg(1,2);
        printOut += board.getPeg(1,3);
        printOut += "     ";
        printOut += board.getClue(1,0);
        printOut += board.getClue(1,1);
        printOut += board.getClue(1,2);
        printOut += board.getClue(1,3);
        printOut +="\n";
        printOut += board.getPeg(2,0);
        printOut += board.getPeg(2,1);
        printOut += board.getPeg(2,2);
        printOut += board.getPeg(2,3);
        printOut += "     ";
        printOut += board.getClue(2,0);
        printOut += board.getClue(2,1);
        printOut += board.getClue(2,2);
        printOut += board.getClue(2,3);
        printOut +="\n";
        printOut += board.getPeg(3,0);
        printOut += board.getPeg(3,1);
        printOut += board.getPeg(3,2);
        printOut += board.getPeg(3,3);
        printOut += "     ";
        printOut += board.getClue(3,0);
        printOut += board.getClue(3,1);
        printOut += board.getClue(3,2);
        printOut += board.getClue(3,3);
        printOut +="\n";
        printOut += board.getPeg(4,0);
        printOut += board.getPeg(4,1);
        printOut += board.getPeg(4,2);
        printOut += board.getPeg(4,3);
        printOut += "     ";
        printOut += board.getClue(4,0);
        printOut += board.getClue(4,1);
        printOut += board.getClue(4,2);
        printOut += board.getClue(4,3);
        printOut +="\n";
        printOut += board.getPeg(5,0);
        printOut += board.getPeg(5,1);
        printOut += board.getPeg(5,2);
        printOut += board.getPeg(5,3);
        printOut += "     ";
        printOut += board.getClue(5,0);
        printOut += board.getClue(5,1);
        printOut += board.getClue(5,2);
        printOut += board.getClue(5,3);
        printOut +="\n";
        printOut += board.getPeg(6,0);
        printOut += board.getPeg(6,1);
        printOut += board.getPeg(6,2);
        printOut += board.getPeg(6,3);
        printOut += "     ";
        printOut += board.getClue(6,0);
        printOut += board.getClue(6,1);
        printOut += board.getClue(6,2);
        printOut += board.getClue(6,3);
        printOut +="\n";
        printOut += board.getPeg(7,0);
        printOut += board.getPeg(7,1);
        printOut += board.getPeg(7,2);
        printOut += board.getPeg(7,3);
        printOut += "     ";
        printOut += board.getClue(7,0);
        printOut += board.getClue(7,1);
        printOut += board.getClue(7,2);
        printOut += board.getClue(7,3);
        printOut +="\n";
        printOut += board.getPeg(8,0);
        printOut += board.getPeg(8,1);
        printOut += board.getPeg(8,2);
        printOut += board.getPeg(8,3);
        printOut += "     ";
        printOut += board.getClue(8,0);
        printOut += board.getClue(8,1);
        printOut += board.getClue(8,2);
        printOut += board.getClue(8,3);
        printOut +="\n";
        printOut += board.getPeg(9,0);
        printOut += board.getPeg(9,1);
        printOut += board.getPeg(9,2);
        printOut += board.getPeg(9,3);
        printOut += "     ";
        printOut += board.getClue(9,0);
        printOut += board.getClue(9,1);
        printOut += board.getClue(9,2);
        printOut += board.getClue(9,3);
        printOut +="\n";
        printOut += board.getPeg(10,0);
        printOut += board.getPeg(10,1);
        printOut += board.getPeg(10,2);
        printOut += board.getPeg(10,3);
        printOut += "     ";
        printOut += board.getClue(10,0);
        printOut += board.getClue(10,1);
        printOut += board.getClue(10,2);
        printOut += board.getClue(10,3);
        printOut +="\n";
        printOut += board.getPeg(11,0);
        printOut += board.getPeg(11,1);
        printOut += board.getPeg(11,2);
        printOut += board.getPeg(11,3);
        printOut += "     ";
        printOut += board.getClue(11,0);
        printOut += board.getClue(11,1);
        printOut += board.getClue(11,2);
        printOut += board.getClue(11,3);

        System.out.println(printOut);




    }
    public void printCode(Board board){
        String printOutCode = " ";
        printOutCode += board.getCodePeg(0);
        printOutCode += board.getCodePeg(1);
        printOutCode += board.getCodePeg(2);
        printOutCode += board.getCodePeg(3);

        System.out.println(printOutCode);
    }
}
