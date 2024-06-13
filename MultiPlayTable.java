public class MultiPlayTable {
    public static void main(String[] args) {
        System.out.println("Multiply Table");
        for(int i = 0; i < 13; i++){
            System.out.println("\n Table of " + i + "\n");
            for(int j = 0; j < 13; j++){
                System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
    }
}
