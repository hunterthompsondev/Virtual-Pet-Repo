/**
 * Main.java
 * 
 * Functionality for testing Virtual Pet classes
 */
public class Main {
    public static void main(String[] args) {
        // Define starting pets
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Luna");
        Dog dog2 = new Dog("Clementine");
        Dog dog3 = new Dog("Josephine");

        // Print information about the pets
        System.out.println("Welcome everybody...");
        dog.bark();
        dog2.bark();
        dog3.bark();
        cat.meow();

        dog.feed();
        dog2.feed();
        dog3.feed();
        cat.play();

        dog.fetch();
        dog2.fetch();
        dog3.fetch();
        cat.purr();

        dog.showStatus();
        cat.showStatus();
    }
}
