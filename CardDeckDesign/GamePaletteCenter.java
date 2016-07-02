package populardesignProblems.CardDeckDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PPandey on 6/27/2016.
 */
public class GamePaletteCenter
{
    List<Card> palette;
    public static String myStr = "hi tejshri";


    GamePaletteCenter(){
        palette = new ArrayList<Card>();
    }

    void addCard(Card card)
    {
        palette.add(card);
    }


}