package animals;

public class Horse extends Animal implements Namedly {

    public Horse(String b, int a, String c) {
        this.breed = b;
        this.age = a;
        this.color = c;
        this.name = "unknown";
    }

    @Override
    public void barking() {
        System.out.println("iiirrrrgg");
    }
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }
}
