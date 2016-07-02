package populardesignProblems.TicTacToe.game;

/**
 * Created by PPandey
 */
public class Cell {
    Move cellValue;

    boolean isEmpty()
    {
        return cellValue == null;
    }

    public Move getCellValue() {
        return cellValue;
    }

    public void setCellValue(Move cellValue) {
        this.cellValue = cellValue;
    }
}
