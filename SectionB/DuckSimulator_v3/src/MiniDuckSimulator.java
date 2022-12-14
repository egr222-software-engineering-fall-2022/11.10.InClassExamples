public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.performFly();
        redheadDuck.swim();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.swim();

        decoyDuck.setFlyBehavior(new FlyWithRocketPower());
        decoyDuck.performFly();
    }
}