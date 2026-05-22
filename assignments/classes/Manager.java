import static java.lang.Character.getName;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void manageTeam() {
        System.out.println(getName() + " bagaa zohion baiguulj baina");
    }
}
