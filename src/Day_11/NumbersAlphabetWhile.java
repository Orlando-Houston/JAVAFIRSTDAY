package Day_11;

public class NumbersAlphabetWhile {
    public static void main(String[] args) {
        int numbers=1;
        int count;
        char letters='a';

        while(numbers<6){
            System.out.print(numbers+"\t");
            count=0;
            while(count<4){
                System.out.print(letters+"\t");
                count++;
                letters++;
            }
            System.out.println();
            numbers++;
        }
    }
}
