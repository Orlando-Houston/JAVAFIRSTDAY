package Day_23_29_CreatingClasses;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle myRedBike = new Bicycle(16,"Red");
        myRedBike.goFast();
        myRedBike.goFast(" crazy ");
        myRedBike.goSlowly();
        Bicycle myBlueBike = new Bicycle(20,"Blue");
        System.out.println(myBlueBike.size);
    }
}
