public class Shark extends Fish {
    @Override
    public String swim() {
        return "Shark is swimming fast!";
    }

    public String eat(Fish fish) {
        return this.toString() + " is eating " + fish.toString();
    }
}