package Day_5;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);

        System.out.print("Enter your consumption : ");
        int myConsumption = myScanner.nextInt();
        double electricBill;
        if(myConsumption<501){
            electricBill = myConsumption*0.3;
        }
        else if (myConsumption<1001){
            electricBill = myConsumption * 0.4;
        }
        else if (myConsumption<2001){
            electricBill = myConsumption * 0.5;
        }
        else {
            electricBill = myConsumption * .6; // without 0 double numbers are ok. like .5456
        }
        System.out.format("$%.2f",electricBill);
    }
}

