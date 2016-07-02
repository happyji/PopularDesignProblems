package populardesignProblems.TicTacToe.game;

/**
 * Created by PPandey on 7/2/2016.
 */
public class CellPosition {
    int x;
    int y;

    boolean isValidCellPosition(int x, int y)
    {
        if(x>=0 && y>=0 && x<3 && y<3)
            return true;

        return false;
    }
}
