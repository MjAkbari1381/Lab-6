package Zoo;

public class Girafe extends Mammal implements Prey {
    protected String specialProperty;

    public Girafe(String name, String age, String speed, String specialProperty) {
        super(name, age, speed);
        this.specialProperty = specialProperty;
    }

    protected void showSpecialProperty() {
        System.out.println("Special Property: " + specialProperty);
    }

    @Override
    public void show() {
        showAnimal();
        showMammal();
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
