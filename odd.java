import java.util.Scanner;
public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int number = sc.nextInt();
        if(number % 2 == 0) {
        System.out.print(number +" is even number.");
    } else {
        System.out.print(number +" is odd number.");
    }
    sc.close();
}
}