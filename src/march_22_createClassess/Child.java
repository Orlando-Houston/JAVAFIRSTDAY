package march_22_createClassess;

public class Child extends Parent {
    int y;
    Child(int y,int x){
        super(x);//parent class attr x initialized using by Constructor
        this.y=y;
    }
    void callThisMethod(){
        int a=super.getX();
        a++;
    }
}
