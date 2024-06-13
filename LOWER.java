public class LOWER {
    public static void main(String[] args) {
        
        int[] numbers = {7, 15, 56, 87, 5 ,98 ,3654, 6, 64587, 32, 32, 5, 12};

        int lower = numbers[0];
        int higher = numbers[0];

        for(int i : numbers){
            if(i < lower){
                lower = i;
            }
        }
        System.out.println("lower number is: " + lower);

        for(int i : numbers){
            if(i > higher){
                higher = i;
            }
        }
        System.out.println("lower number is: " + higher);


    }
}
