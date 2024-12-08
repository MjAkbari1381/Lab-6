package Zoo;

public abstract class Animal {
    protected String name;
    protected String age;

    public Animal(String name, String age) {
        this.age = age;
        this.name = name;
    }

    protected void showAnimal() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public abstract void show();
}
