package OODSpring2021.Week1;

public class ModelDuck extends Duck{
    public ModelDuck(){
        //our model duck originally cannot fly
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }
    
}
