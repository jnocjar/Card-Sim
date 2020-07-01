package CardSim;

public class Game 
{
    public Game(String name)
    {
        _name = name;

        // Create the "Rules" Policy here according 
        // to the game selected for simulation.
        //_rules = new Rules(....);

        // Create the deck according to the Policy.
        // For now we build a deck for the game War it consists of 52 cards.
        _deck = new WarDeck("Generic", 52);

        // Create the players according to the Policy


        // Start the Game using the Players, Deck and Policy
    } /* end constructor */

    public void dump()
    {
        System.out.format(_name + _deck.toString());
    }

    private Deck _deck;
    private String _name;
} /* end Game */