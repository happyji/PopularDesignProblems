package populardesignProblems.CardDeckDesign;

import java.util.List;

/**
 * Created by PPandey on 6/27/2016.
 */
public class Game
{
    Deck deck;
    List<Player> players;
    GamePaletteCenter gamePaletteCenter;

    Game(List<Player> players)
    {
        this.players = players;
        deck = new Deck();
        gamePaletteCenter = new GamePaletteCenter();
    }

}