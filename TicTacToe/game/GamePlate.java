package populardesignProblems.TicTacToe.game;

import populardesignProblems.TicTacToe.game.Cell;

/**
 * Created by PPandey on 7/2/2016.
 */
public class GamePlate {

    Cell[][] plate;
    Integer noOfCellFilled;


    public GamePlate()
    {
        plate = new Cell[3][3];
        noOfCellFilled =0;
    }

    boolean isFull()
    {
       return noOfCellFilled >= 9;
    }




}
