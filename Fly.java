public interface Fly {

    // bird takes off
    void takeOff();

    // bird ascending
    int ascend(int meters);

    // bird descending
    int descend(int meters);

    // bird landing
    void land();

    // bird gliding through the air
    default void glide() {
        System.out.println("glides into the air.");
    }
}
