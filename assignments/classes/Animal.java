public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name == null ? "" : name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " khoolloj baina");
    }
}
