public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        SurgeonFish surgeonFish = new SurgeonFish();
        FlyingShark flyingShark = new FlyingShark();
        Insect insect = new Insect();

        System.out.println(shark.eat(surgeonFish));
        System.out.println(shark.eat(new Shark()));

        System.out.println(flyingShark.eat(new Shark()));
        System.out.println(flyingShark.eat(insect));

        Fish fish = new Shark();
        Flyable flyer = new FlyingShark();
        System.out.println(fish.swim());
        System.out.println(flyer.fly());
    }
}