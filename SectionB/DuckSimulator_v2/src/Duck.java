public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {
    }

    public abstract void display();
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("Swim");
    }

    public void performFly() { flyBehavior.fly(); }
}