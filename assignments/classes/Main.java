public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("Luna");
        cat.eat();
        cat.meow();

        Vehicle v = new Vehicle();
        v.showSpeed();

        Car car = new Car();
        car.drive();
        car.showSpeed();

        Vehicle polyCar = new Car();
        polyCar.showSpeed();
        if (polyCar instanceof Car) {
            ((Car) polyCar).drive();
        }

        Manager mgr = new Manager("Bold");
        Developer dev = new Developer("Tuya");
        mgr.work();
        mgr.manageTeam();
        dev.work();
        dev.code();

        Shape rect = new Rectangle(3, 4);
        Shape circ = new Circle(2);
        System.out.println("Untsugat talbain tom: " + rect.area());
        System.out.println("Duguin talbain tom: " + circ.area());
    }
}