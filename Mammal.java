package Zoo;

public abstract class Mammal extends Animal {
    protected String speed;

    public Mammal(String name, String age, String speed) {
        super(name, age);
        this.speed = speed;
    }

    protected void showMammal() {
        System.out.println(", Speed: " + speed);
    }
}
