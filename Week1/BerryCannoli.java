public class BerryCannoli extends CannoliDecorator{
    public BerryCannoli(Cannoli decoratedCannoli) {
        super(decoratedCannoli);
    }

    @Override
    public void assemble(){
        System.out.println("stiamo assemblando i tuoi berrycannoli adesso " + "@ $" + cost());//we are assembling your berry cannoli now!
    }

    public int cost(){
        return 3;
    }
    
}
