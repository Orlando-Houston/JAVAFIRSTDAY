package Day_23_29_CreatingClasses;

public class Car {
    int modelYear;
    double engineVolume;
    String modelName;
    public Car(int year,double engine, String model){
        modelYear = year;
        engineVolume = engine;
        modelName = model;
    }
    public void startEngine(){
        System.out.println("Vrooom");
    }

}
