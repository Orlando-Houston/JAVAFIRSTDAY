package SecondDay;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        int edge1;
        int edge2;
        int edge3;
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter first edge : ");
        edge1 = myScanner.nextInt();
        edge2 = myScanner.nextInt();
        edge3 = myScanner.nextInt();
        System.out.println(edge1+edge2+edge3);

    }
}
