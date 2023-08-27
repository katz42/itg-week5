public class Giraffe extends Animal {

    @Override
    void eat() {
        System.out.println("Giraffe likes to eat leaves.");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println("Also giraffe can sleep fully standing.");
    }
}
