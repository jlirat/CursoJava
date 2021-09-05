package animals;

public class Cat extends Animal implements Namedly {
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public Cat(String b, int a, String c) {
        super(b, a, c);
        name = "unknown";
    }

    @Override
    public void barking() {
        // TODO Auto-generated method stub
        System.out.println(String.format("%s: %s ", name, "Meeeoo!!!"));
    }

}
