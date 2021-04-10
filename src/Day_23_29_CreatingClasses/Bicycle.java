package Day_23_29_CreatingClasses;

public class Bicycle {
    int size;
    String color;
    public Bicycle(int bikeSize,String bikeColor){
        size=bikeSize;
        color=bikeColor;
    }
    public void goFast(){
        System.out.println("Going fast");
    }
    public void goFast(String level){
        System.out.println("Going"+level+"fast");
    }
    public void goSlowly(){
        System.out.println("Cruising slowly");
    }

}
