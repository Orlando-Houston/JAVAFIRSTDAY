package March_16_createClassess;

public class ExampleEncapsulationTest {
    public static void main(String[] args) {
        ExampleEncapsulation myTest = new ExampleEncapsulation(10,59999);
        System.out.println(myTest.getId());
        myTest.setId(40);
        System.out.println(myTest.getId());
    }
}
