package animals;

public class Parrot extends Animal implements Namedly {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public Parrot(String b, int a, String c) {
        super(b, a, c);
        name = "unknown";
    }
    public void namedAs(String n) {
        name = n;
    }
    @Override
    public void barking() {
        System.out.println(String.format("%s: %s ", name, "quiere galleta!!!"));
    }
    
}
