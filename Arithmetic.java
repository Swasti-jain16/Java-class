import java.util.Scanner;
import javax.sound.midi.SysexMessage;
 public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        double num1 =sc.nextDouble();
        System.out.print("Enter second number:");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient =num1 / num2;
        System.out.println("Addition:- " + sum);
        System.out.println("Substraction:- " +   difference);
        System.out.println("Multiplication:- " +  product);
        System.out.println("Division:- " +  quotient);
    }
}

    

