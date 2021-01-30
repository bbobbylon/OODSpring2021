package OODSpring2021.Week1;

public abstract class Duck {
    //declare two reference variables for the behavior interface types
    //all duck subclasses (in the same package) inherit these
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    
    public Duck() {}
    public abstract void display();
    public void performFly() {
        //delegate to the behavior class
        flyBehavior.fly();

    }
    public void performQuack() {
        quackBehavior.quack(); //delegate to the behavior class

    }

    public void swim() {
        System.out.println("All ducks float fool.");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
