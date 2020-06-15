package CardSim;

public class Game 
{
    public Game(String name)
    {
        _name = name;

        _deck = new WarDeck("Generic", 52);
    } /* end constructor */

    public void dump()
    {
        System.out.format(_name + _deck.toString());
    }

    private Deck _deck;
    private String _name;
} /* end Game */