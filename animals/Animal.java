package animals;

public abstract class Animal {
    String breed;
    String color;
    int age;
    double weight;
    public Animal() {
        this.breed = "pequinnes";
        this.age = 0;
        this.color = "white";
        this.weight = 300; //; 300 / 1000
    }

    public Animal(String b, int a, String c) {
        this.breed = b;
        this.age = a;
        this.color = c;
    }

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
}
