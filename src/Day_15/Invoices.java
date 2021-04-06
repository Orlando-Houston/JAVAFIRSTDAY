package Day_15;

public class Invoices {
    public static void main(String[] args) {
        System.out.println(decideElectricBill(5500));
        System.out.println(evaluateInternet(600));
    }

    public static String decideElectricBill(int consumption){
        String decision;
        if(consumption>=500 && consumption<=1000){
            decision="Good Job";
        }
        else if(consumption>1000 && consumption<=1500){
            decision="Not Bad";
        }
        else if(consumption>1500){
            decision="Start Saving Energy";
        }
        else {
            decision="Consumption is wrong";
        }
        return decision;
    }
    public static String evaluateInternet(int speed){
        String conclusion;
        if(speed>300){
            conclusion="Super Speed";
        }
        else if(speed>100){
            conclusion="Good Speed";
        }
        else {
            conclusion="Unknown speed";
        }
        return conclusion;
    }
}
