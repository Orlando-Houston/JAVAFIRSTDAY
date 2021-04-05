package Day_12;

public class NumbersLetters {
    public static void  printNumsLetters(){
        for(int i=1;i<5;i++){
            System.out.print(i+"\t");
            for(char j=97;j<102;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
