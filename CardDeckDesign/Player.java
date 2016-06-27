package populardesignProblems.CardDeckDesign;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by PPandey on 6/27/2016.
 */
public class Player
{
    String name;
    String playerId;
    List<Card> mainCards;
    List<Card> wonCards;
    GamePaletteCenter gamePaletteCenter;

    Player(String n,String id)
    {
        name = n;
        playerId = id;
        mainCards = new ArrayList<Card>();
        wonCards = new ArrayList<Card>();
        gamePaletteCenter = new GamePaletteCenter();
    }

    private Card throwCard(){
        return null;
    }

    Card payChance(Iterator<Card> currentBet){
        return throwCard();
    }

    void acceptCardsAfterWiningChance(List<Card> cards)
    {
        wonCards.addAll(cards);
    }

}