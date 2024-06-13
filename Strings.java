public class Strings{
    public static void main(String[] args) {
        System.out.println("Strings in java");

        String text = "Hello World";

        System.out.println("String: " + text);
        System.out.println("String length: " + text.length());
        System.out.println("String UPPER CASE: " + text.toUpperCase());
        System.out.println("String lower case: " + text.toLowerCase());
        System.out.println("String search for 'W': " + text.indexOf("W"));

        System.out.println("Java String Concatenation");

        String first_name = "Mohammed";
        String last_name = "saleh";

        System.out.println("Strings: " + first_name + last_name);
        System.out.println("Strings conct: " + first_name.concat(last_name));

        String Sus_String1 = "Hey , Let's hover \"Here\"";
        String Sus_String2 = "Hey , Let\'s check out here";
        String Sus_String3 = "GET DOWN \\ Sniper!";
        String Sus_String4 = "STOP DELETING ME \b\b\b\b\b\b";
        String Sus_String5 = "test for \f from fead";




        System.out.println("sus: " + Sus_String1);
        System.out.println("sus: " + Sus_String2);
        System.out.println("sus: " + Sus_String3);
        System.out.println("sus: " + Sus_String4);
        System.out.println("sus: " + Sus_String5);

        

    }
}