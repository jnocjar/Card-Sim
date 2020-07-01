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
        // Create the cards of the WarDeck
        // The deck should be a standard 4-suit all included deck
        // - no extra cards such as jokers.
        // - this is *not* a pinochle deck.
        for (int i = 0; i < super.getSize(); )
        {
            _cards[i++] = new Card(CardSuit.Hearts, i+1);
            _cards[i++] = new Card(CardSuit.Spades, i+1);
            _cards[i++] = new Card(CardSuit.Diamonds, i+1);
            _cards[i++] = new Card(CardSuit.Clubs, i+1);
        }
    }

    @Override
    public void shuffle() 
    {
        // Auto-generated method stub

    }

    private Card[] _cards;
} /* end WarDeck */   