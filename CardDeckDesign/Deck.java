package populardesignProblems.CardDeckDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by PPandey
 */
public class Deck
{
    List<Card> allCards;
    final int SUIT_PER_DECK = 4;
    final int CARDS_PER_SUIT = 13;


    Deck() {
        allCards = new ArrayList<Card>();
    }

    private void init()
    {
        int index =0;
        for (int i=0; i< SUIT_PER_DECK;i++)
        {
            for (int j=0 ; j< CARDS_PER_SUIT;j++)
            {
                index = i * CARDS_PER_SUIT + j;

            }
        }
    }

    void Shuffle()
    {
        Collections.shuffle(allCards);
    }

    List<List<Card>> distribute()
    {
        return null;
    }

}