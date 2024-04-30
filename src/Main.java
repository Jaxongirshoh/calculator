import java.util.Scanner;

public class Main {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Enter the number");
        double number1 = scannerInt.nextInt();
        System.out.println("enter the sign +\\-\\*\\/");
        String sign = scannerStr.next();
        System.out.println("enter the second number");
        double number2 = scannerInt.nextInt();
        switch (sign){
            case "+"->{
                System.out.println(number2+number1);
            }
            case "-"->{
                System.out.println(number1-number2);
            }
            case "*"->{
                System.out.println(number1*number2);
            }
            case "/"->{
                System.out.println(number1/number2);
            }
        }
    }
}