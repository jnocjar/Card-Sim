import CardSim.*;

public class Sim 
{
    public Sim() {}

    static public void main(String[] args)    
    {
        System.out.println("Welcome to Sim built by Ant");

        Game g = new Game("War");

        g.dump();
    }
}