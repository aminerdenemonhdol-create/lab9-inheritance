public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name == null ? "" : name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(name + " ajillaj baina");
    }
}
