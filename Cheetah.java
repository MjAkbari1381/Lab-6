package Zoo;

public class Cheetah extends Mammal implements Hunter {
    protected String specialProperty;

    public Cheetah(String name, String age, String speed, String specialProperty) {
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
    public void hunt() {
        huntingMessage();
        System.out.println(name + " Hunts");
    }
}
