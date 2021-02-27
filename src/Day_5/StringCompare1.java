package Day_5;

public class StringCompare1 {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";

        if(a==b){
            System.out.println("Hello");
        }

        String c = new String("x");
        String d = new String("x");

        if(c==d){
            System.out.println("World");
        }
    }
}
