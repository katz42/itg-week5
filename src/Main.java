public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Rabbit rabbit = new Rabbit();
        RedIguana iguana = new RedIguana();
        Giraffe giraffe = new Giraffe();

        zoo.letsEat(rabbit);
        zoo.timeToSleep(rabbit);
        System.out.println("");
        zoo.letsEat(iguana);
        zoo.timeToSleep(iguana);
        System.out.println("");
        zoo.letsEat(giraffe);
        zoo.timeToSleep(giraffe);
    }
}