import java.awt.*;
import java.util.*;
import java.util.List;

enum Suit
{
    CLUB,
    SPADE,
    HEART,
    DIAMOND
}

enum Face
{
    ACE, TWO, THREE,FOUR,FIVE,
    SIX,SEVEN,EIGHT,NINE,TEN,
    JACK,QUEEN,KING
}

class Card implements Comparable
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

class Deck
{
    List<Card> allCards;
    final int SUIT_PER_DECK = 4;
    final int CARDS_PER_SUIT = 13;


    Deck() {
        allCards = new ArrayList<>();
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

class Player
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
        mainCards = new ArrayList<>();
        wonCards = new ArrayList<>();
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

class GamePaletteCenter
{
    List<Card> palette;


    GamePaletteCenter(){
        palette = new ArrayList<>();
    }

    void addCard(Card card)
    {
        palette.add(card);
    }


}

class Game
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

public class Solution {

    public static void main(String args[]){

    }



}
