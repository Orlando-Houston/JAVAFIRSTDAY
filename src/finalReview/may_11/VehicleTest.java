package finalReview.may_11;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle ("Red",4);
        Vehicle bus = new Bus("yelow",2);

        car.honk();
        bus.honk();
    }
}
