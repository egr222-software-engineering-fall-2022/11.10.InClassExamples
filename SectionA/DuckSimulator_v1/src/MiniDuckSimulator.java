public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.swim();
        mallard.performFly();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.swim();
        redheadDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.swim();
        decoyDuck.performFly();

        // supercharge our duck!
        decoyDuck.setFlyBehavior(new FlyWithRocketPower());
        decoyDuck.performFly();
    }
}