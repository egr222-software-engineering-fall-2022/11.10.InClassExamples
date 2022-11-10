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

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
