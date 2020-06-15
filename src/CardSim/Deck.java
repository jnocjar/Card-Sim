package CardSim;

public abstract class Deck 
{
    public Deck (String name, int size)
    {
        _name = name;
        _size = size;
    }
/*
    public Deck( CardGamePolicy policy )
    {
        this.Deck(policy.name, policy.size);
    }
*/
    public abstract void init();
/*    public abstract Card getCard(); */
    public abstract void shuffle();

    @Override
    public String toString()
    {
        String str = new String();
        str = _name + _size;

        return (str);
    }

    // return the size of the deck
    public int getSize() { return _size; }

    private String _name;
    private int _size;
} /* end Deck */
