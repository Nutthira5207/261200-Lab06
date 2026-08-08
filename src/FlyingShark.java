public class FlyingShark extends Shark implements Flyable {
    @Override
    public String fly() {
        return "FlyingShark is gliding through the air!";
    }

    public String eat(Flyable creature) {
        return "FlyingShark caught a flying creature!";
    }
}