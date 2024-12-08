package Zoo;

public interface Prey {
    void getName();
    void escape();

    default void escapeMessage() {
        System.out.println("The prey is trying to escape!");
    }
}
