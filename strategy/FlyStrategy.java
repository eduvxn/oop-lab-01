package strategy;

public class FlyStrategy extends MoveStrategy {
    @Override
    public void move() {
        System.out.println("Летим");
    }
}
