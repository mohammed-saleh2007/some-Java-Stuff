public class IfActivities {
    public static void main(String[] args) {
        System.out.println("Some If..else real life activites");

        int age = 17;
        int need = 18;
        
        System.out.println("Your age is: " + age);
        System.out.println("You need to be: "+ need);

        String share = (age >= 16) ? "You can share!" : "Go Away Baby :)";
        System.out.println(share);

        if (age >= 18){
            System.out.println("You can vote!");
        }else if(age >= 16){
            System.out.println("You can make a card!");
        }else{
            System.out.println("go away baby :)");
        }
    }
}
