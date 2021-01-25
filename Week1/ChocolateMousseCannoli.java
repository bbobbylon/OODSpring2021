//lets make a chocolate mousee cannoli class
public class ChocolateMousseCannoli implements Cannoli{
    @Override
    public void assemble(){
        System.out.println("we are assembling your chocolate cannoli now" + " @ $" + cost()); //we are making your chocolate cannoli now!
    }
    public int cost(){
        return 2;
    }
}