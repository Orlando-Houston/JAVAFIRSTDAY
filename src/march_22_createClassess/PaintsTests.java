package march_22_createClassess;

public class PaintsTests {
    public static void main(String[] args) {
        Paint myPaint = new Paint("zero gravity",2800);
        System.out.println(myPaint.toString());
        System.out.println(myPaint.calculatePrice());
        CustomPaint myCustomPaint = new CustomPaint("moon blue",3200,"durable","extra glossy");
        System.out.println(myCustomPaint.calculateCustomPrice());
    }
}
