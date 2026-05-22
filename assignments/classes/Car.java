public class Car extends Vehicle {
    public void drive() {
        speed += 20;
        System.out.println("Mashin yavj baina, hurd: " + speed);
    }

    @Override
    public void showSpeed() {
        System.out.println("Mashinii hurd: " + speed);
    }
}
