package OODSpring2021.Week1;

//this will be our cannoli interface
//It contains two methods that will be used in each file/class that implements Cannoli: each of the methods can be adjusted in the subclasses
public interface Cannoli{
    public void assemble();
    public abstract int cost();
}