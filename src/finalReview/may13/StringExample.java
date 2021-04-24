package finalReview.may13;

public class StringExample {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println("a="+a.hashCode()+"\tb="+b.hashCode());

        System.out.println(a == b);
        String c = new String("abc");
        String d = new String("abc");
        System.out.println("c="+c.hashCode()+"\td="+d.hashCode());
        System.out.println(c.equals(d));

        System.out.println("abc".compareTo("def"));
        System.out.println(10+10);
        System.out.println(""+10+10);
        System.out.println('0'+'0');

    }
}
