package populardesignProblems.TicTacToe;

import populardesignProblems.TicTacToe.game.GameAdministrator;
import populardesignProblems.TicTacToe.game.GamePlate;

/**
 * Created by PPandey
 */
public class Game {
    GamePlate gamePlate;
    GameAdministrator gameAdministrator;


    Game(){
      gamePlate = new GamePlate();
    }


}
