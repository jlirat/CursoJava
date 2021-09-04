import animals.Dog;

public class Main {
    public static void main(String args[]) {
        Dog bendi = new Dog("pug", 3, "beige");
        Dog oskar = new Dog("doberman", 9, "black");
        
        bendi.namedAs("Bendi");
        oskar.namedAs("Oskar");

        bendi.barking();
        bendi.setAge(4);
        System.out.println(String.format("%s is my weight", bendi.getWeight()));
        oskar.barking();
    }
}
