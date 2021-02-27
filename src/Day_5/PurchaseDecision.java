package Day_5;

import java.util.Scanner;

public class PurchaseDecision {
    public static void main(String[] args) {
        Scanner scanItems = new Scanner(System.in);
        System.out.print("Please enter the color (blue/red) :");
        String color = scanItems.nextLine();
        System.out.print("Please enter tag price : ");
        double priceTag = scanItems.nextDouble();
        System.out.print("Please enter discount percentage (0.1-0.9) :");
        float discount = scanItems.nextFloat();

        int colorValue=0;
        if(color.compareToIgnoreCase("red")==0){
            colorValue = 20;
        }
        else if (color.compareToIgnoreCase("blue")==0){
            colorValue = 10;
        }
        else {
            System.out.println("red or blue only");
        }

        int productPoint = (int)(priceTag*discount-colorValue);

        if(productPoint>=100){
            System.out.println("DO NOT BUY IT! ");
        }
        else if(productPoint>=50) {
            System.out.println("Buy it later ");
        }
        else {
            System.out.println("BUY IT RIGHT NOW !!!");
        }
    }
}
