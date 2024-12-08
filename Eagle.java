package Zoo;

public class Eagle extends Birds implements Hunter {
    protected String specialProperty;

    public Eagle(String name, String age, String flyHeight, String specialProperty) {
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
    public void hunt() {
        huntingMessage();
        System.out.println(name + " Hunts");
    }
}
