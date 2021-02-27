package Day_5;

import java.util.Scanner;

public class PerimetersFromUser {
    public static void main(String[] args){
        //Creating Scanner object to read from keyboard
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter C, R, or T : ");
        //Receiving answer form the user
        String shape = myScan.next();
        if(shape.compareToIgnoreCase("c")==0){ //For the Circle
            //ask radius from user
            System.out.print("please enter the radius : ");
            double radius = myScan.nextDouble();
            System.out.println(2*3.14*radius);
        }
        else if (shape.compareToIgnoreCase("r")==0){
            //ask width and height from user
            System.out.print("Enter width : ");
            int width = myScan.nextInt();
            System.out.println("Enter height : ");
            int height = myScan.nextInt();
            System.out.println(2*(width+height));
        }
        else if (shape.compareToIgnoreCase("t")==0) {
            //aks edges from user
            System.out.println("Please enter edge 1 : ");
            int edge1 = myScan.nextInt();
            System.out.println("please enter edge 2 :");
            int edge2 = myScan.nextInt();
            System.out.println("please enter edge 3 :");
            int edge3 =myScan.nextInt();
            System.out.println(edge1+edge2+edge3);

        }
        else {
            System.out.println("Please C, R or T ");
        }

    }
}
