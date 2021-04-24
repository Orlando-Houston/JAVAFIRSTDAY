package finalReview.may13;

public class StringBuilderExample {
    public static void main(String[] args) {
        String x = "a";
        StringBuilder builder = new StringBuilder("abcdefgh");
        builder.setCharAt(0,'z');
        System.out.println(builder);
        builder.delete(0,builder.length());
        System.out.println(builder);
        builder.append(x);
        System.out.println(builder);
        builder = new StringBuilder(x);

    }
}
