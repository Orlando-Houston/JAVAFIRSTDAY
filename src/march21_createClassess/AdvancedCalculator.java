package march21_createClassess;

public class AdvancedCalculator  extends Calculator{
    String screenColor;
    public AdvancedCalculator(){
        super();
        this.screenColor="blue";
    }
    public AdvancedCalculator(String color){
        super();
        this.screenColor=color;
    }
    double calcAverage(int a,int b){
        double average= (a+b)/2;
        return  average;
    }
    int calcFactorial(int a){
        int factorial=1;
        for (int i = a; i > 0 ; i--) {
            factorial *= i;
        }
        return factorial;
    }
    double calcSqrt(int a){
        return Math.sqrt(a);
    }
    int calcPower(int a,int b){
        return (int)Math.pow(a,b);
    }
}
