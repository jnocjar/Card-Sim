package CardSim;
 
public class WarDeck extends Deck
{
    public WarDeck(String name, int size)
    {
        super(name, size);

        _cards = new Card[size];
    } /* end Constructor */

    @Override
    public void init() 
    {
        int count=0;
        // Create the cards of the WarDeck
        // The deck should be a standard 4-suit all included deck
        // - no extra cards such as jokers.
        // - this is *not* a pinochle deck.
        for (int i = 0; i < super.getSize(); i+=4)
        {
            _cards[i] = new Card(CardSuit.Hearts, i+2);
            _cards[i+1] = new Card(CardSuit.Spades, i+3);
            _cards[i+2] = new Card(CardSuit.Diamonds, i+4);
            _cards[i+3] = new Card(CardSuit.Clubs, i+5);
        }
    }

    @Override
    public void shuffle() 
    {
        // Auto-generated method stub

    }

    private Card[] _cards;
} /* end WarDeck */   