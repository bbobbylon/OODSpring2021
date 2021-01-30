package OODSpring2021.Week1;

//we will use the cannoli interface in this file

public class RegularCannoli implements Cannoli{
    @Override
    public void assemble(){
        //do stuff
        System.out.println("stiamo assemblando i tuoi cannoli regolari ora" + " @ $" + cost());//we are assembling your regular cannoli now
    };
    public int cost(){
        return 1;
    }
}