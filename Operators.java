public class Operators {
    public static void main(String[] args) {
        System.out.println("Java Operators");
        
        int x = 5;
        int y = 3;

        int sum = x + y;
        float devid = (float) x / y;

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + x * y);
        System.out.println(x + " / " + y + " = " + devid);
        System.out.println(x + " % " + y + " = " + x % y);

        System.out.println("java compare operations");

        System.out.println(x + " > " + y + " = " + (x>y));
        System.out.println(x + " < " + y + " = " + (x<y));
        System.out.println(x + " != " + y + " = " + (x!=y));

    }
}
