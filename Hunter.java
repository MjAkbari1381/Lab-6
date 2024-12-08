package Zoo;

public interface Hunter {
    void hunt();

    default void huntingMessage() {
        System.out.println("The hunter is looking for prey.");
    }
}
