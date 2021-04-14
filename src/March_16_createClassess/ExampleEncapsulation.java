package March_16_createClassess;

public class ExampleEncapsulation {
    private int id;
    private double salary;

    public ExampleEncapsulation(int id,double salary){
        this.id=id;
        this.salary=salary;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
}
