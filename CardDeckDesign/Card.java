package populardesignProblems.CardDeckDesign;
import populardesignProblems.CardDeckDesign.GamePaletteCenter.*;

/**
 * Created by PPandey on 6/27/2016.
 */
public class Card implements Comparable
{
    Suit suit;
    Face face;

    Card(Suit s,Face f)
    {
        suit = s;
        face = f;

    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
