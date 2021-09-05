package animals;

public class Dog extends Animal implements Namedly {
    /** Attributes */

    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
    }
    
    /* Constructor */
    public Dog() {
        super("pequinnes", 1, "white");
        this.name = "unknown";
    }
    public Dog(String b, int a, String c) {
        super(b, a, c);
        this.name = "unknown";
    }

    /** Methods */
    public void namedAs(String n) {
        name = n;
    }

    public void barking() {
        System.out.println(String.format("%s: %s ", name, "Woof Woof!!!"));
    }

    public void grow(int ages) {
        this.age += ages;
    }

    public void grow(String month) {
        switch(month) {
            case "january":
                this.age = 6;
                break;
            case "febreaury":
                this.age = 5;
                break;
            case "march":
                this.age = 7;
                break;
            default:

        }    
    }
}