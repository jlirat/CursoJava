package animals;

public class Dog {
    /** Attributes */
    String breed;
    String color;
    int age;
    double weight;
    String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("La edad asignada no es correcta");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }

    
    /* Constructor */
    public Dog() {
        this.breed = "pequinnes";
        this.age = 0;
        this.color = "white";
        this.weight = 300; //; 300 / 1000
        this.name = "unknown";

    }

    public Dog(String b, int a, String c) {
        this.breed = b;
        this.age = a;
        this.color = c;
        this.name ="unknown";
        
    }

    
    /** Methods */
    public void namedAs(String n) {
        name = n;
    }

    public void barking() {
        System.out.println(String.format("%s: %s ", name, "Woof Woof!!!"));
    }
}