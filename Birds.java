package Zoo;

public abstract class Birds extends Animal {
    protected String flyHeight;

    public Birds(String name, String age, String flyHeight) {
        super(name, age);
        this.flyHeight = flyHeight;
    }

    protected void showBird() {
        System.out.println(", Fly Height: " + flyHeight);
    }
}
