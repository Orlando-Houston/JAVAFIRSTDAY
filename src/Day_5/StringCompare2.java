package Day_5;

public class StringCompare2 {
    public static void main(String[] args){
        String a = "a";
        String b = "a";

        if(a.equals(b)){
            System.out.print("Hello ");
        }
        String c = new String("x");
        String d = new String("x");

        if(c.equals(d)){
            System.out.println("World");
        }

    }
}
