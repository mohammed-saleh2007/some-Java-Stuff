public class Calculator {
    static String err_Handler(String err){
        if(err.equals("devied_by_zero")){
            return "[Error] Can't devide by zero! return: ";
        }
        if(err.equals("illegal_argements")){
            return "[Warning] You entered illegal op or numbers, chack again return: ";
        }
        return "";
    }

    static float calc(float x, float y, String op){
        switch (op) {
            case "+":
                return x + y;           
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if( y == 0f ){
                    System.out.print(err_Handler("devied_by_zero"));
                    break;
                }else{
                    return x / y;
                }
            default:
                System.out.print(err_Handler("illegal_argements"));
                break; 
        }
        return 0;
    }

    public static void main(String[] args) {
        float num1 = 55f;
        float num2 = 17f;
        System.out.println(calc(num1, num2, "+"));
        System.out.println(calc(num1, num2, "-"));
        System.out.println(calc(num1, num2, "*"));
        System.out.println(calc(num1, num2, "/"));

        System.out.println(calc(num1, num2, "gh"));

        num2 = 0f;
        System.out.println(calc(num1, num2, "/"));
    }
}
