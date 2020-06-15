package CardSim;

public class CardID 
{
    public CardID(CardSuit suit, int value)
    {
        _suit = suit;
        _value = value;
    }

    public CardSuit getCardSuit() { return _suit; }
    public int getCardValue() { return _value; }

    @Override
    public String toString()
    {
        return getValueString() + " of " + getSuitString();
    }

    private String getSuitString()
    {
        switch (_suit)
        {
            case Hearts: return new String("Hearts");
            case Spades: return new String("Spades");
            case Diamonds: return new String("Diamonds");
            case Clubs: return new String("Clubs");

            default:
                return new String("");
        }
    }
    private String getValueString()
    {
        switch (_value) 
        {
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            case 14: return "King";
            
            default: //Throw a really bad exception since this CardID is corrupt.
                return new String("");
        } /* end switch */
    }

    private CardSuit _suit;
    private int _value;
}