package finalReview.may13;

public class StringReversing {
    public static void main(String[] args) {
        String str  = "Java is fun";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
