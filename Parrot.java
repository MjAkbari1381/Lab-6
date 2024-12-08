package Zoo;

public class Parrot extends Birds implements Prey {
    protected String specialProperty;

    public Parrot(String name, String age, String flyHeight, String specialProperty) {
        super(name, age, flyHeight);
        this.specialProperty = specialProperty;
    }

    protected void showSpecialProperty() {
        System.out.println("Special Property: " + specialProperty);
    }

    @Override
    public void show() {
        showAnimal();
        showBird();
        showSpecialProperty();
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void escape() {
        escapeMessage();
        System.out.println(name + " escapes");
    }
}
