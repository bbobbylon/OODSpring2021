
public abstract class CannoliDecorator implements Cannoli {
    //let's make an instance of a cannoli
    protected Cannoli decoratedCannoli;
    public CannoliDecorator(Cannoli decoratedCannoli){
        super();
        this.decoratedCannoli = decoratedCannoli;
    }
    @Override
    public void assemble(){
        decoratedCannoli.assemble();
    }
}