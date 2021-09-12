package animals;

public abstract class Animal {
    int id;
    String breed;
    String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int age;
    double weight;
    String observacion;
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Animal() {
        this.breed = "pequinnes";
        this.age = 0;
        this.color = "white";
        this.weight = 300; //; 300 / 1000
        this.observacion = "";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
