import animals.Dog;
import animals.Parrot;
import animals.Cat;

public class Main {
    public static void main(String args[]) {
        Dog bendi = new Dog("pug", 3, "beige");
        Dog oskar = new Dog("doberman", 9, "black");
        Cat ramiro = new Cat("malish", 1, "black");
        Parrot juancho = new Parrot("austrailian", 5, "green");
        bendi.namedAs("Bendi");
        oskar.namedAs("Oskar");
        juancho.namedAs("juancho");

        bendi.barking();
        bendi.setAge(4);
        System.out.println(String.format("%s is my weight", bendi.getWeight()));
        oskar.barking();
        ramiro.barking();
        juancho.barking();

    }
}
