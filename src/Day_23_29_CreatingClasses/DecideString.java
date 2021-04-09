package Day_23_29_CreatingClasses;

public class DecideString {
    public static void main(String[] args) {
        String mySentence="This is our JaVa ClaSS";
        decideString(mySentence);
    }
    public static void decideString(String sentence){
        int numCapitals= CapitalLetters.countAllCapitals(sentence);
        if(numCapitals>4){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Rejected");
        }
    }
}
