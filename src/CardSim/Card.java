package CardSim;

public class Card 
{
    public Card(CardSuit suit, int number)
    {
        _cardId = new CardID(suit, number);
    }

    public String toString()
    {
        return _cardId.toString();
    }

    private CardID _cardId;
}